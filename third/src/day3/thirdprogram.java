package day3;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class thirdprogram {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		EventFiringWebDriver a= new EventFiringWebDriver(driver);
		File srcfile = a.getScreenshotAs(OutputType.FILE);
		File dscfile = new File("D:/actitime1.png");
		driver.quit();
		
	}

}
