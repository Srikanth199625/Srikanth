package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstprogram {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement loginbutton = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		loginbutton.click();
		driver.findElement(By.id("u_e_b_VW")).sendKeys("santosh");*/
		driver.get("https://www.facebook.com/");
		driver.findElement(By.partialLinkText("Create new account")).click();
		/*Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='sl-sobe-carousel-sub-card-title'])[2]")).click();*/

		
	}

}
