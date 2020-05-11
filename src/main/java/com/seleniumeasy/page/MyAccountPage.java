package com.seleniumeasy.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MyAccountPage extends PageBase {
	
	public MyAccountPage (WebDriver driver) {
		
		super (driver);
	}
	
	public void getTitle() {
		System.out.println(driver.getTitle());
	} 


public MyAccountPage simpleformdemo () throws InterruptedException {
	
    
    
    
	entermessage.sendKeys("TEST1");
	button1.click();
	entera.sendKeys("10"); 
	enterb.sendKeys("20");
	gettotal.click();

	return new MyAccountPage (driver);
}	


public MyAccountPage checkbox () throws InterruptedException {
	
	checkbox.click();

	click1.click();
	Thread.sleep(3000);
	click2.click();
	click3.click();
	click4.click();
	click5.click();
	Thread.sleep(4000);

	check1.click();
	Thread.sleep(3000);
	check2.click();
			
		return new MyAccountPage (driver);
		
	}


public MyAccountPage radiobuttondemo () throws InterruptedException {
	
	
	inputform.click();
	radiobuttondemo.click();
	Thread.sleep(3000);
	 
	radiomale.click();
	radiofemale.click();
	radiobutton.click();
	
	radiomale1.click();
	radiofemale2.click();
	radioage1.click();
	radioage2.click();
	radioage3.click(); 
	radioagebutton.click(); 
	
	return new MyAccountPage (driver);
	

}
public MyAccountPage selectdropdownlist () throws InterruptedException {
	
	inputform.click();
	selectdropdownlist.click();
	pleaseselect.click();
	sunday.click();
	//scroll down
	JavascriptExecutor js = ((JavascriptExecutor) driver);
	js.executeScript("window.scrollBy(0,200)");
	Thread.sleep(3000);
	
	newjersey.click();
	System.out.println("GET ALL SELECT DISPLAY : " + allselected.isDisplayed());
	allselected.click();
	
	return new MyAccountPage (driver);
	

}

public MyAccountPage inputformsabmit() throws InterruptedException {
	
	inputform.click();
	inputformsubmit.click();
	Thread.sleep(3000);
	firstname.sendKeys("Ali");
	lastname.sendKeys("Candogan");
	email.sendKeys("ali@gmail.com");
	phone.sendKeys("01 5553332249");
	address.sendKeys("860 River Driver");
	//scroll down
	JavascriptExecutor js = ((JavascriptExecutor) driver);
	js.executeScript("window.scrollBy(0,200)");
	Thread.sleep(3000);
	city.sendKeys("Paterson");
	statebutton.click();
	statenewjersey.click();
	zip.sendKeys("55578");
	website.sendKeys("www.sample.com");
	hostingyes.click();
	hostingno.click();
	comment.sendKeys("TEST TESTING");
	System.out.println("SEND IS ENABLE IS: "+ send.isEnabled());
	
	return new MyAccountPage (driver);
	

}
public MyAccountPage ajaxform () throws InterruptedException {
	
	inputform.click();
	ajaxform.click();
	Thread.sleep(3000);
	
	ajaxname.sendKeys("Ali Oz");

	ajaxcomment.sendKeys("TEST AJAX");
	ajaxsubmit.click();
	
	
	return new MyAccountPage (driver);
	
}

public MyAccountPage jquerydropdown () throws InterruptedException {
	
	inputform.click();
	jquerydropdown.click();
	Thread.sleep(3000);
	
	jqueryselectcountry.sendKeys("United States of America");

	
	jqueryselectstate.click();   
	jquerynjstate.click();
	jqueryselectstate.click();  

	//usoutlying.click();
	//usoutlying.sendKeys("Virgin Islands");
	//usoutlying.click();
	
	jqueryisland.click();
	
	jqueyjava.click();
	
	
	
	
	
	
	 
	return new MyAccountPage (driver);
	

}





}
