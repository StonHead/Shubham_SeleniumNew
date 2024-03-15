package exercise;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTCApp2 {
	
	WebDriver driver;
	
	@Before
	public void launchApp() throws Exception {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		Thread.sleep(5000);
	}
	
	@After
	public void closeApp() throws Exception {
		
		Thread.sleep(7000);
		driver.close();
//		driver.quit();
	}
	
	@Test
	public void verifyLoginFeature() throws Exception {
		
//		driver.findElement(By.partialLinkText("CONTACT US")).click();			//tagname ---- p
		
		
		
		driver.findElement(By.partialLinkText("FLIGHTS")).click();
		
		Thread.sleep(5000);
		
		System.out.println("********************" + driver.getTitle());
		
	}
	

}
