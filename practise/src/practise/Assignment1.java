package practise;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		WebElement checkbox= driver.findElement(By.xpath("(//span[@class='checkmark'])[2]"));
		checkbox.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		WebElement options = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown = new Select(options);
		dropdown.selectByValue("consult");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		List<WebElement> products = driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		for(int i=0; i<products.size(); i++) {
			products.get(i).click();
		}
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		driver.findElement(By.id("country")).sendKeys("Vijayawada");
		WebElement element = driver.findElement(By.id("checkbox2"));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-lg']")).click();
		driver.quit();
		
		
		
	}

}
