package facebook;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webpagepractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item'] //a"));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li//a[@text='Coimbatore (CJB)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li//a[@text='Vijayawada (VGA)'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("hrefIncAdt")).click();
		for (int i = 1; i < 3; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("hrefIncChd")).click();
		Thread.sleep(3000);
		WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select staticdropdown = new Select(dropdown);
		staticdropdown.selectByValue("INR");

	}

}
