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

public class MyntraApp {
	
	
	
	WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Constants.MyntraAPP);
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
		WebElement returnPolicy = driver.findElement(By.xpath("//strong[contains(text(),'14days')]"));

		
		
		
		JavascriptExecutor JS = (JavascriptExecutor)driver;
		

		
		JS.executeScript("arguments[0].scrollIntoView()", returnPolicy);
		
		
	}
	
	
	
}
