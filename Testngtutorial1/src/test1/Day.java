package test1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day {

	
	@BeforeMethod
	public void firstmethod() {
		System.out.println("This is Method executes first before test");
	}
	
	@Test
	public void loan() {
		
		System.out.println("This is Loan test Method");
	}
	
	@Test
	public void carloan() {
		System.out.println("This is car loan Method");
	}
	@AfterMethod
	public void secondmethod() {
		System.out.println("This Method executes before test");
	}
}
