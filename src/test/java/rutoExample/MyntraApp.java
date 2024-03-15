package rutoExample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.Constants;

public class MyntraApp {
	
	
	
	WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Constants.nopComm);
		Thread.sleep(7000);
	}

	
	@AfterTest
	public void CloseApp() throws Exception {
		
		
		Thread.sleep(7000);
		driver.close();
		driver.quit();
	}
	
	
	@Test
	public void verifyRegisterStudent() {
		
		
//		driver.findElement(By.xpath("")).click();
//		driver.findElement(By.xpath("")).sendKeys("");;
		
		driver.findElement(By.cssSelector("input#Password")).sendKeys("ahsfkjdha");
		
		driver.findElement(By.name("Password")).sendKeys("values to send");
		
		driver.findElement(By.cssSelector("input#RememberMe")).click();
		
		driver.findElement(By.tagName("button")).click();
		
		
		
	}
	
	
	
}
