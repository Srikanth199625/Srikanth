package day2;

import javax.swing.border.TitledBorder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class secondprogram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String S = driver.getTitle();
		if(S.equals("Google"))
		{
			System.out.println("Matching the Ttile");
		}
		else 
		{
			System.out.println("Not Matched with the title" +S);
		}
		String url= driver.getCurrentUrl();
		if(url.contains("google.co.in"))
		{
			System.out.println("Pass the url is Matching");
		}
		else
		{
			System.out.println("Fail: The url is not Matching:" +url);
		}
		driver.quit();

	}

}
