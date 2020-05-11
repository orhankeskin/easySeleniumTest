package com.seleniumeasy.page;

import org.openqa.selenium.WebDriver;


public class HomePage extends PageBase   {
	
	
	public HomePage (WebDriver driver) {
		
		super(driver);
		
	}
	
	
	public MyAccountPage inputform () {  
		inputform.click();
 		
		return new MyAccountPage(driver); 

	}
	
	
	
	public MyAccountPage checkbox   () {  
		checkbox.click();
 		                      
		return new MyAccountPage(driver); 

	}
				
	
	public MyAccountPage radiobuttondemo  () {  
		
		radiobuttondemo.click();
 		
		return new MyAccountPage(driver); 

	}
	

	public MyAccountPage selectdropdownlist () {  
		
		selectdropdownlist.click();
 		
		return new MyAccountPage(driver); 

	}
	
public MyAccountPage inputformsabmit () {  
		
	inputformsubmit.click();
 		
		return new MyAccountPage(driver); 

	}
	

public MyAccountPage ajaxform () {  
	
	ajaxform.click();
 		
		return new MyAccountPage(driver); 

	}


public MyAccountPage jquerydropdown () {  
	
	jquerydropdown.click();
 		
		return new MyAccountPage(driver); 

	}


}
