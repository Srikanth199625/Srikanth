package guru99page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v115.css.model.SelectorList;
import org.openqa.selenium.support.ui.Select;

public class selectmethod {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		String baseurl = "https://demo.guru99.com/test/newtours/register.php";
		WebDriver driver = new ChromeDriver();
		driver.get(baseurl);
		Thread.sleep(3000);
		Select drpcountry = new Select(driver.findElement(By.name("country")));
		drpcountry.selectByVisibleText("AMERICAN SAMOA");
		Thread.sleep(3000);
		if(drpcountry.equals("AMERICAN SAMOA"))
		{
			System.out.println("Country is correct");
		}
		else {
			System.out.println("Couuntry is not correct");
			driver.close();
		}

	}

}
