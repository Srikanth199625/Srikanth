package com.mymavenpriject.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	WebDriver ldriver;
	loginpage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUsername;
	
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	
	@FindBy(name="btnlogin")
	@CacheLookup
	WebElement btnlogin;
	
public void setUsername(String Uname)
{
	txtUsername.sendKeys(Uname);
}
public void setPassword(String Pass)
{
	txtPassword.sendKeys(Pass);
}
public void clickSubmit()
{
	btnlogin.click();
}
	
	
	
}
