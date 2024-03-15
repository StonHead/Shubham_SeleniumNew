package javascriptExample;

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

public class RegistrationPage {
	
	
	
	WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Constants.RegisterStudentAPP);
		Thread.sleep(7000);
	}

	
	@AfterTest
	public void CloseApp() throws Exception {
		
		
		Thread.sleep(7000);
//		driver.close();
//		driver.quit();
	}
	
	
	@Test
	public void verifyRegisterStudent() {
		
		//element overlapping ---- driver.click ----- action.click();
		WebElement btnSubmit = driver.findElement(By.xpath("//button[@id='submit']"));
//		WebElement btnSubmit1 = driver.findElement(By.xpath("//button[@id='submit']"));
		
		//driver.
		
		
		
		JavascriptExecutor JS = (JavascriptExecutor)driver;
		
//		JS.executeScript("write any java script");
		
//		JS.executeScript("alert('hello everyone, happy learning!!')");
		
		JS.executeScript("arguments[0].click()", btnSubmit);
		
		
	}
	
	
	
}
