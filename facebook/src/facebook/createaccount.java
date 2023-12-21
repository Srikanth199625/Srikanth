package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class createaccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_8fgl _9l2p'] //input[@name='firstname']")).sendKeys("Srikanth");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_8fgl _9l2p'] //input[@name='lastname']")).sendKeys("Buggala");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_8fgl _9l2p'] //input[@name='reg_email__']")).sendKeys("srikanthbuggala@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_8fgl _9l2p'] //input[@name='reg_email_confirmation__']")).sendKeys("srikanthbuggala@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_8fgl _9l2p'] //input[@name='reg_passwd__']")).sendKeys("Srikanth@1996");
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.id("day"));
		Select daylist = new Select(day);
		daylist.selectByValue("25");
		Thread.sleep(3000);
		WebElement month = driver.findElement(By.id("month"));
		Select monthlist = new Select(month);
		monthlist.selectByValue("5");
		Thread.sleep(3000);
		WebElement year = driver.findElement(By.id("year"));
		Select yearlist = new Select(year);
		yearlist.selectByValue("1996");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='_5k_3'] //input[@value='2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_1lch'] //button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[@class='_5lnf uiOverlayFooter _5a8u'] //a[@class='_42ft _4jy0 layerButton uiOverlayButton _4jy3 _517h _51sy']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[@class='_9o1z'] //input[@class='inputtext _9o1w _9o1_']")).sendKeys("")

	}

}
