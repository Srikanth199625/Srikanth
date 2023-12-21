package practise;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Greenkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		String[] itemsneeded = {"Brocolli", "Carrot", "Brinjal"};
		additems(driver,itemsneeded);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//div[@class='action-block'] //button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.xpath("//div[@class='promoWrapper']//input[@type='text']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//div[@class='promoWrapper']//button[@class='promoBtn']")).click();
		try {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		}
		
		
		
	}

	private static void additems(WebDriver driver, String[] itemsneeded) {
		// TODO Auto-generated method stub
		
		int j=0;
		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0; i<product.size(); i++) {
			//Brocolli - 1 Kg
			//Brocolli  1 Kg
			String[] name = product.get(i).getText().split("-");
			String formatedname = name[0].trim();
			
			List itemsneedlist = Arrays.asList(itemsneeded);
			if(itemsneedlist.contains(formatedname))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				if(j==itemsneeded.length) {
					break;
				}
				
				
			}
			
		}
		
	}

}
