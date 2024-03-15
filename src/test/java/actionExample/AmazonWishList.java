package actionExample;

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
		driver.get("https://www.amazon.in/");
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
		
		
		WebElement SignIn = driver.findElement(By.xpath("//span[contains(text(),'Hello, sign in')]"));
		WebElement WishList = driver.findElement(By.xpath("//span[contains(text(),'Create a Wish List')]"));
		
		
		Actions act = new Actions(driver);
		
		
//		act.click(SignIn);		//click on SignIN
		
		
//		//app1
//		act.moveToElement(SignIn).perform();
//		act.moveToElement(WishList).perform();
//		act.click().perform();
//		
//		
//		//app2
//		
//		act.moveToElement(SignIn).moveToElement(WishList).click().perform();
		
		
		//app3
		act.moveToElement(SignIn).click(WishList).perform();
//		act.moveToElement(SignIn).click(WishList);
		
		
		
		
		System.out.println(driver.getTitle());
		
	}
	
	
	
}
