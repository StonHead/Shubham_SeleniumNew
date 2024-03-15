package testNGExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationExample {
	
	WebDriver driver;
	//Execution workflow  
	
	//BeforeSuite ------ BeforeTest------BeforeClass-----BeforeMethod
	
	
	@BeforeTest
	public void launchApp() {
		
		System.out.println("launching an applicaiton");
		
	}

	
	@AfterTest
	public void closeApp() {
		
		System.out.println("closeApp an applicaiton");
		
	}
	
	
	@BeforeSuite
	public void BeforeSuite() {
		
		System.out.println("==============BeforeSuite=====================");
		
	}

	
	@AfterSuite
	public void AfterSuite() {
		
		System.out.println("==============AfterSuite=====================");
		
	}
	
	
	
	@BeforeClass
	public void BeforeClass() {
		
		System.out.println("==============BeforeClass=====================");
		
	}

	
	@AfterClass
	public void AfterClass() {
		
		System.out.println("==============AfterClass=====================");
		
	}
	
	
	@BeforeMethod
	public void BeforeMethod() {
		
		System.out.println("*****************BeforeMethod*****************");
		
		
		
		
	}

	
	@AfterMethod
	public void AfterMethod() {
		
		System.out.println("*****************AfterMethod*****************");
		
		System.out.println("*****************Capture a screenshot*****************");
		//if my test case failed ----- do something
		//if my test case pass ---- do something
		
		//capture a screenshot
		
		
		
	}
	
	@Test(priority = -1)
	public void login() {
		
		System.out.println("login test case execution.....");
	}
	
	@Test
	public void logout() {
		
		System.out.println("logout test case execution.....");
	}
	
	
	@Test
	public void addItem() {
		
		System.out.println("addItem test case execution.....");
	}
	
	
	
}
