package practiceproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class updateddropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("divpaxinfo")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		System.out.println(driver.findElement(By.id("hrefIncAdt")).getText());
	    int i =1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		System.out.println(driver.findElement(By.id("hrefIncAdt")));
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		

	}

}
