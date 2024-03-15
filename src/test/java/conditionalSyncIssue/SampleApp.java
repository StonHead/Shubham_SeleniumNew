package conditionalSyncIssue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.Constants;

public class SampleApp {
	
	
	
	WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		//Thread.sleep(7000);
		
		//implicit wait ------ applicable for all the element
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.waitTime));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	}

	
	@AfterTest
	public void CloseApp() throws Exception {
		
		
		Thread.sleep(7000);
		driver.close();
		driver.quit();
	}
	
	
	@Test
	public void verifyRegisterStudent() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#text3")));
		
		
		WebElement text3 = driver.findElement(By.cssSelector("#text3"));
		
//		ExplictWait ---- conditional Wait
		
		
		
		
		text3.sendKeys("enter value into textbox");
		
		
		
		
	}
	
	
	
}
