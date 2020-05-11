package com.seleniumeasy.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.seleniumeasy.page.MyAccountPage;

public class CodeTestPage {
	
	WebDriver driver ;
	
	@Test
	public void codeTest () {
		
		System.setProperty("webdriver.chrome.driver","Util\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");
		System.out.println("Home Page Title is :" + driver.getTitle());	
		
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div/div[2]/select/option[6]")).click();
		
	
		
	
	
		
	
	}

}
