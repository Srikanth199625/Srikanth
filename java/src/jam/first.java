package jam;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class first {

	public static void main(String[] args) throws Throwable{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "D:\\Srikanth\\Edgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Srikanth");
		driver.findElement(By.name("inputPassword")).sendKeys("Srikanth@123");
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		Thread.sleep(3000);
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Srikanth");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Srikanth@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9160440435");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//p[@class='infoMsg']")).getText());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Srikanth");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//p[@style='color: rgb(27, 179, 102); font-size: 18px; text-align: center;']")).getText());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
		driver.quit();
	}

}
