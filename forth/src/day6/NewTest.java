package day6;

import org.testng.Reporter;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {
	WebDriver driver;
	@Test
	public void division()throws Throwable{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://calc.qedgetech.com/");
		driver.findElement(By.xpath("(//input[@id='btn'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='btn'])[1]")).sendKeys("123456");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@value='x'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='btn'])[1]")).sendKeys("78");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='=']")).click();
		Thread.sleep(3000);
		String mulres = driver.findElement(By.xpath("(//input[@id='btn'])[1]")).getAttribute("value");
		Reporter.log("Multiplication results::" +mulres, true);
		driver.close();
		
		
	}
{
  }

}
