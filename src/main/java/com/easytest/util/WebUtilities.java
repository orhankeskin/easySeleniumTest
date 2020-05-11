package com.easytest.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebUtilities {
	
	
	
	/**
	 * @param driver - WebDriver instance
	 * @param elements - elements locator
	 * @return - element is visible or null
	 * Function to wait for element to be visible
	 */
	public Boolean waitForElement(WebDriver driver, final WebElement elements) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver,60);
		//wait.ignoring(NoSuchElementException.class);
		try {
			/*// add exceptions to ignore
			wait.ignoring(NoSuchElementException.class);*/

			// below statement will wait until element becomes visible
			wait.until(ExpectedConditions.visibilityOf(elements));
			wait.until(ExpectedConditions.elementToBeClickable(elements));

		} catch (StaleElementReferenceException e) {
			
			wait.until(ExpectedConditions.stalenessOf(elements));
			
			//wait.ignoring(NoSuchElementException.class);

			// below statement will wait until element becomes visible
			wait.until(ExpectedConditions.visibilityOf(elements));
			wait.until(ExpectedConditions.elementToBeClickable(elements));
		}
		
		WebElement ex = null;
		Boolean found = false;
		if ((ex = elements) != null) {
			for (int j = 0; j < 400; j++) {
				if (ex.isDisplayed() && ex.isEnabled()) {
					found = true;
					break;
				} else {
					Thread.sleep(100);
				}
			}
		}
		if (found == false) {
			return null;
		}
		return found;		
	}
	
	/**
	 * @param driver - WebDriver instance
	 * @param elements - elements locator
	 * @return - element is visible or null
	 * Function to wait for element to be visible
	 */
	public List<WebElement> waitForElementList(WebDriver driver, List<WebElement> emtList) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver,60);
	  	List<WebElement> elementList = wait.until(ExpectedConditions.visibilityOfAllElements(emtList));	
	  	
	  	return elementList;
	}
	
	
public void waitForPageToload(WebDriver driver) {
		
		//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
				
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String command = "return document.readyState";

		for (int i = 0; i < 10000; i++) {

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("System error -> " + e);
			}

			if (js.executeScript(command).toString().equals("complete")) {
				break;
			}
		}
	}

	/**
	 * @param testCaseName
	 * @param c
	 * @return 
	 * @return 
	 * @return count 
	 * Function to get count of testcase
	 */
	public List<String> getListOfFiles(String directory) {

		File folder = new File(directory);
		File[] listOfFiles = folder.listFiles();
		ArrayList<String> filenames=new ArrayList<String>();  
		
		if (folder.exists()) {
			if(listOfFiles.length != 0) {
				for (int i = 0; i < listOfFiles.length; i++) {
					if (listOfFiles[i].isFile()) {
						filenames.add(listOfFiles[i].getName());
					}
				}
			}else {
				System.err.println("Empty directory: " + directory);
			}			
		} else {
			System.err.println("Notable to find folder: " + directory);
		}		
		return filenames;
	}

	/**
	 * @param testCaseName
	 * @param c
	 * @return count 
	 * Function to get count of testcase
	 */
	public int getCharactersCount(String testCaseName, char c) {

		int count = 0;

		for (int i = 0; i < testCaseName.length(); i++) {
			if (testCaseName.charAt(i) == c)
				count++;
		}

		return count;
	}
}





