package testcase1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	public String url= "http://demo.guru99.com/test/newtours/";
	String driverpath = "D:\\chromedriver.exe";
	public WebDriver driver;
  @Test
  public void f()throws Exception {
	  System.out.println("Launching Browser");
	  System.setProperty("webdriver.chrome.driver", driverpath);
	  driver.get(url);
	  String expectedtitle = "Welcome: Mercury Tours";
	  String actualtitle = driver.getTitle();
	  Assert.assertEquals(actualtitle, expectedtitle);
	  driver.close();
  }
}
