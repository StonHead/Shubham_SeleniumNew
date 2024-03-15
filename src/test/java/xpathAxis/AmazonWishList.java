package xpathAxis;

import org.openqa.selenium.By;
//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonWishList {
	
	
	
	WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		Thread.sleep(7000);
	}

	
	@AfterTest
	public void CloseApp() throws Exception {
		
		
		Thread.sleep(7000);
//		driver.close();
//		driver.quit();
	}
	
	
	@Test
	public void verifyRegisterStudent() throws Exception {
		
		
		WebElement checkbox = driver.findElement(By.xpath("//td[text()='Helen Bennett']/preceding-sibling::td/input"));
		checkbox.click();
		
	}
	
	
	
}
