package com.easytest.util;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CodeNeeded {

	// My account page  e codelarin altina yaziliyor
	// Scroll Down
	/*
	 * JavascriptExecutor js = ((JavascriptExecutor) driver);
	 * js.executeScript("window.scrollBy(0,200)"); Thread.sleep(5000);
	 * 
	 * // Scroll up 
	 * js.executeScript("window.scrollBy(0,-400)"); Thread.sleep(5000);
	 */
	
	
//	PNG olarak screenshot almak icin		
	
/*		File myImage = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(myImage, new File("C:\\Users\\Cuneyt\\Selenium\\screenShots\\Resim.png")); */
	
	
//		jpg olarak screenshot almak icin
			
/*		File myImage = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(myImage, new File("C:\\Users\\Cuneyt\\Selenium\\screenShots\\1.jpg")); */
	
	
//		Detayli tarih koyarak screenshot almak
	
	
	//String adate = new SimpleDateFormat("MM-dd-yyyy-HHmmss").format(new Date(1));
	
	//File myImage = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
	

//	String destination = "C:\\SCREENSHOT\\1.jpg";
//	File finalDestination = new File(destination + adate);
//	FileUtils.copyFile(myImage, finalDestination);
	

	
	
	
	
	
	
}
