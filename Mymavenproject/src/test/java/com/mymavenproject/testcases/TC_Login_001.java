package com.mymavenproject.testcases;

import org.junit.Assert;
import org.junit.Test;


import com.mymavenpriject.pageobjects.loginpage;

public class TC_Login_001 extends Baseckass
{
	@Test
	public void loginTest()
	{
		driver.get(baseURL);
		loginpage lp = new loginpage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	
	}

	
	
}
