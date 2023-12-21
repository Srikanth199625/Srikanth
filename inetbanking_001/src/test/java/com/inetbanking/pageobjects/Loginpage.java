package com.inetbanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver ldriver;
	
	Loginpage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUsername;
	
	
	@FindBy(name= "password")
	@CacheLookup
	WebElement txtpassword;
	
	
	@FindBy(name= "btnlogin")
	@CacheLookup
	WebElement btnlogin;
	
	public void seetUsername(String uname)
	{
	txtUsername.sendKeys(uname);	
	}
	
	public void setpassword(String pwd) {
		txtpassword.sendKeys(pwd);
	}
	
	public void clicksubmit() {
		btnlogin.click();
	}

}
