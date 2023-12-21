package testcase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;

public class NewTest {
	private WebDriver driver;
	private String 	baseurl;
	public int scc = 0;
	private StringBuffer verificationErrors = new StringBuffer();
	
  
  @BeforeMethod
  
  @BeforeTest
  public void setup() {
	  driver = new ChromeDriver();
	  //step1 Launch Url
	  baseurl="http://live.techpanda.org/";
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
  }
  @Test
  public void day1testcase1() throws Throwable{
	  driver.get(baseurl);
	  //sep2 Verify the title page
	  String demosite =  driver.findElement(By.cssSelector("h2")).getText();
	  System.out.println(demosite);
	  try {
		  AssertJUnit.assertEquals("This is demo site for :", demosite);
	} catch (Exception e) {
		// TODO: handle exception
	}
	  //step3 click on 'Mobile Menu'
	  driver.findElement(By.linkText("MOBILE")).click();
	  //step4 In Mobile Menu List Sort list by name
	  new Select(driver.findElement(By.xpath("(//select[@onchange='setLocation(this.value)'])[1]"))).selectByVisibleText("Name");
	  //step5 verify all products sort by name
	  scc=scc+1;
	  File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  String png =("D:\\Srikanth\\Srilanth-doc"+scc+".png");
	 
  }

  @AfterTest
  public void afterTest() {
  }

}
