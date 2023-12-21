package facebookimage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseurl="https://www.facebook.com/pages/create/?ref_type=registration_form";
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseurl);
		//click on facebook image
		driver.findElement(By.xpath("//div/h1/a/i")).click();
		if(driver.getTitle().equals("Facebook login page")) {
			System.out.println("Current page is Facebook loginpage");
		}
		else {
			System.out.println("Current page is not facebook loginpage");
		}
		driver.close();
		
	}

}
