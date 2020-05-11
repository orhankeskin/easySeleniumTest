package com.seleniumeasy.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
	
	
	WebDriver driver;
	
	public PageBase(WebDriver driver) {
		
		this.driver =driver;
		PageFactory.initElements(driver, this);
		 
	}
	
	
	
	//                 PAGE FACTORY  ...........
	// sample form.........
	
	
	@FindBy(xpath="//*[@id=\"treemenu\"]/li/ul/li[1]/a")
	WebElement inputform;
	
	@FindBy(xpath="//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[1]/a")
	WebElement simpleformdemo;
	
	@FindBy(xpath="//*[@id=\"user-message\"]")   
	WebElement entermessage;
	
	@FindBy(xpath="//*[@id=\"get-input\"]/button")   
	WebElement button1;
	
	@FindBy(id="sum1")
	WebElement entera;
	
	@FindBy(id="sum2")
	WebElement enterb;
	
	@FindBy(xpath="//*[@id=\"gettotal\"]/button")
	WebElement gettotal;

	
	// CheckBoxDemo
	
	
	@FindBy(xpath ="//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[2]/a")    
	WebElement checkbox;
	
	@FindBy(id="isAgeSelected")
	WebElement click1;
	
	@FindBy(xpath="//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label/input")  
	WebElement click2;
	
	@FindBy(xpath="//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label/input")
	WebElement click3;
	
	@FindBy(xpath="//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[3]/label/input")
	WebElement click4;
	
	@FindBy(xpath="//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[4]/label/input")
	WebElement click5;
	
	
	@FindBy(id="check1")
	WebElement check1;
	
	@FindBy(id="check1")
	WebElement check2;
	
	
	//RADIO BUTTON
	
	@FindBy(xpath="//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[3]/a")  
	WebElement radiobuttondemo;
	
	
	@FindBy(xpath="//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[1]/input")  
	WebElement radiomale;
	@FindBy(xpath="//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[2]/input")  
	WebElement radiofemale;
	@FindBy(id="buttoncheck")  
	WebElement radiobutton;

	@FindBy(xpath="//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[1]/input")  
	WebElement radiomale1;
	@FindBy(xpath="//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[2]/input")  
	WebElement radiofemale2;
	

	@FindBy(xpath="//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[1]/input")  
	WebElement radioage1;
	@FindBy(xpath="//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[2]/input")  
	WebElement radioage2;
	@FindBy(xpath="//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[3]/input") 
	WebElement radioage3;
	
	@FindBy(xpath="//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")  
	WebElement radioagebutton;
	
	
	// selectdropdownlist code
	@FindBy(xpath="//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[4]/a")  
	WebElement selectdropdownlist;
	
	@FindBy(id="select-demo")  
	WebElement pleaseselect;
	
	@FindBy(xpath="//*[@id=\"select-demo\"]/option[2]")  
	WebElement sunday;
	
	@FindBy(xpath="//*[@id=\"multi-select\"]/option[3]")  
	WebElement newjersey;
	
	@FindBy(id="printAll")  
	WebElement allselected;
	
	
	// inputformsabmit
	
	
	@FindBy(xpath="//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[5]/a")  
	WebElement inputformsubmit;
	
	//Contact Us Today!
	@FindBy(name="first_name")  
	WebElement firstname;
	
	@FindBy(name="last_name")  
	WebElement lastname;
	
	@FindBy(name="email")  
	WebElement email;
	
	@FindBy(name="phone")  
	WebElement phone;
	
	@FindBy(name="address")  
	WebElement address;
	
	@FindBy(name="city")  
	WebElement city;
	
	@FindBy(name="state")  
	WebElement statebutton;
	
	@FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[7]/div/div/select/option[32]")  
	WebElement statenewjersey;
	
	@FindBy(name="zip")  
	WebElement zip;
	
	@FindBy(name="website")  
	WebElement website;
	
	@FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[10]/div/div[1]/label/input")  
	WebElement hostingyes;
	
	@FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[10]/div/div[2]/label/input")  
	WebElement hostingno;
	
	@FindBy(name="comment")  
	WebElement comment;
	
	@FindBy(xpath="//*[@id=\"contact_form\"]/fieldset/div[13]/div/button")  
	WebElement send;

	/// ajaxform codes
	
	@FindBy(xpath="//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[6]/a")  
	WebElement ajaxform ;
	
	@FindBy(xpath="//*[@id=\"title\"]") 
	WebElement ajaxname;
	
	@FindBy(id="description")  
	WebElement ajaxcomment;
	
	@FindBy(xpath="//*[@id=\"btn-submit\"]")  
	WebElement ajaxsubmit;
	
	// jquerydropdown codes
	
	@FindBy(xpath="//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[7]/a")  
	WebElement jquerydropdown;
	
	@FindBy(id="country")  
	WebElement jqueryselectcountry;
	
	
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/div[2]/span/span[1]/span/ul/li/input")  
	WebElement jqueryselectstate;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[2]/div/div[2]/select/option[31]")  
    WebElement jquerynjstate;
	
	
	//@FindBy(xpath="/html/body/div[2]/div/div[2]/div[3]/div/div[2]/span/span[1]/span/span[2]")  
	//WebElement usoutlying;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/div[3]/div/div[2]/select/option[6]")  
	WebElement jqueryisland;
	
	
	@FindBy(xpath="//*[@id=\"files\"]/optgroup[2]/option[2]")  
	WebElement jqueyjava;
}
