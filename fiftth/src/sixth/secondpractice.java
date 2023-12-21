package sixth;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class secondpractice {

	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String baseURL = "https://accounts.google.com/InteractiveLogin/signinchooser?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=Af_xneE0IJ-k7OvsXWOQFiIetRODA_bHj6B6SaSDepyhiFOtMZFaKBlGvh-7AMVPw9YVJpMwUpQktQ&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
		driver.get(baseURL);
		try {
			Thread.sleep(2000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement useanotheraccount = driver.findElement(By.linkText("Create account"));
		useanotheraccount.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Create account")));
		WebElement createaccount = driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[3]"));
		createaccount.click();
		WebElement formyself = driver.findElement(By.xpath("(//span[@jsname='K4r5Ff'])[1]"));
		formyself.click();
		WebElement fname = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		fname.sendKeys("sreesree");
		WebElement lname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		lname.sendKeys("srksrk");
		WebElement next = driver.findElement(By.xpath("//div[@class='VfPpkd-Jh9lGc']"));
		next.click();
		
				
		
	

	}

}
