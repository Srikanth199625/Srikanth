package com.mymavenproject.testcases;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseckass {
	public String baseURL= "https://demo.guru99.com/v3/index.php";
	public String username= "mngr164225";
	public String password = "jahetAp";
	public static WebDriver driver;

	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe" );
		driver = new ChromeDriver();
		
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	

}
