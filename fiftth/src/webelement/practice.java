package webelement;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class practice {

	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.drive", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		String baseURL = "https://accounts.google.com/InteractiveLogin/signinchooser?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=Af_xneGV4JsDqvOsiYBXveFKSXt4bTN8qfBpl5vFq8pjY4awQwa4n8zXNIJMTfiRr1pDrtARb8QarA&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
		
		driver.get(baseURL);
		try {
			Thread.sleep(2000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		WebElement next = driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]"));
		email.sendKeys("buggalasrikanth@gmail.com");
		Thread.sleep(3000);
		next.click();
		
			
		WebElement Password = driver.findElement(By.xpath("(//button/div)[4]"));
		Thread.sleep(3000);
		WebElement button = driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]"));
		Password.sendKeys("SriKanth1996");
		button.click();
		driver.close();
		
		
		
	}

}
