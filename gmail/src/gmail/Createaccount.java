package gmail;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Createaccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "D:\\chromedriver-win64\\chromdriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.get("https://accounts.google.com/InteractiveLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=ASKXGp0kp2fw70-bzHaz4ae6aOGpl4yOgkHq3AHAQfDNJQRJzcyaCttnfjz377IElZ_DWNis-ht7Ag&theme=glif&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[3]")).click();
		driver.findElement(By.xpath("(//span[@class='VfPpkd-StrnGf-rymPhb-b9t22c'])[1]")).click();
		//WebDriverWait wait = 
		driver.findElement(By.xpath("//div[@class='Xb9hP'] /input[@name='firstName']")).sendKeys("Srikanth");
		driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[2]")).sendKeys("Buggala");
		driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
		WebElement staticd = driver.findElement(By.id("month"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("month")));
		Select dropdown = new Select(staticd);
		dropdown.selectByValue("5");
		
	}

}
