package takeScreenshotExample;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
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
		driver.get(Constants.amazonApp);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	}

	
	@AfterTest
	public void CloseApp() throws Exception {
		
		
//		Thread.sleep(7000);
		driver.close();
		driver.quit();
	}
	
	
	@Test
	public void verifyRegisterStudent() throws Exception {
		
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("iphone 15 pro");
		
		driver.findElement(By.cssSelector("[value=Go]")).click();
		
		
		//capture a screenshot
		
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		
//		
//		File targetLocation = new File(".\\screenshot\\AmazonSearch11.png"); 
//		
//		
//		FileUtils.copyFile(screenshotFile, targetLocation);
		
		
		getScreenShot("iphone 15 pro");
		
		
		
	}
	
	
	
	
	
	public void getScreenShot(String filename) throws Exception {
		
//		
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		
//		ts.getScreenshotAs(OutputType.FILE);
		
		
		
		
		
		File sourceLocation = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		
		File targetLocation = new File(".\\screenshot\\AmazonSearch_iphone.png"); 
		
		
//		FileUtils.copyFile(sourceLocation, new File(".\\screenshot\\"+ filename +".png"));
		FileUtils.copyFile(sourceLocation, targetLocation);
		
		
//		FileUtils.c
		
	}
	
	
	
}
