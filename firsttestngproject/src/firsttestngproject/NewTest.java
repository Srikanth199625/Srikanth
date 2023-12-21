package firsttestngproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	public String baseurl = "http://live.techpanda.org/index.php/";
	String driverpath= "D:\\chromedriver.exe";
	public WebDriver driver;
	public String expected = null;
	public String actual = null;
  @Test(priority  = 0)
  public void Register() {
	  driver.findElement(By.xpath("//*[text()='Mobile']")).click();
	  expected= "This is root of mobile";
	  actual= driver.getTitle();
	  Assert.assertEquals(actual, expected);
  }
  @BeforeMethod
  public void Verifytitlepage() {
	  String expectedtitle= "Welcome: Magneto";
	  String actualtitle = driver.getTitle();
	  Assert.assertEquals(actualtitle, expectedtitle);
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Launching the chrome browser");
	  System.setProperty("Webdriver.chrome.driver", driverpath);
	  driver= new ChromeDriver();
	  driver.get(baseurl);
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
