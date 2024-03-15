package handleFrame;

import org.openqa.selenium.By;
//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleAppFrame {
	
	
	
	WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		Thread.sleep(7000);
	}

	
	@AfterTest
	public void CloseApp() throws Exception {
		
		
		Thread.sleep(7000);
		driver.close();
		driver.quit();
	}
	
	
	@Test
	public void verifyRegisterStudent() throws Exception {
		
		
		WebElement photoFrame = driver.findElement(By.cssSelector("[data-src*='photo']"));
		
		driver.switchTo().frame(photoFrame);
		
		
		
		
		WebElement img3 = driver.findElement(By.cssSelector("img[src*='tatras3']"));
		
		String img_alt = img3.getAttribute("alt");

		System.out.println("Alt property: " + img_alt);
		
		
		
		
	}
	
	
	
}
