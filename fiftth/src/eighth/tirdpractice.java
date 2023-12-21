package eighth;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tirdpractice {

	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String baseURL = "https://accounts.google.com/v3/signin/identifier?dsh=S-738156653%3A1688015003264460&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowEntry=ServiceLogin&flowName=GlifWebSignIn&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AeDOFXi5-GvHDe9FuDzlHBMiHY9vCEqvO3j4TIobCf4dVNnJGpwNtas_K9DAj0lzGxic_panD5bz&osid=1&passive=1209600&service=mail";
		driver.get(baseURL);
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Help")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='WgJpmf'])[2]"))).click();
		driver.findElement(By.xpath("(//*[@class='NUwdAb TrZEUc'])[2]")).click();
	
		driver.findElement(By.xpath("//a[@class='WgJpmf'])[3]")).click();
		driver.close();
		

	}

}
