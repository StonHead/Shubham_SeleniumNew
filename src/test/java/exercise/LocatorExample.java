package exercise;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExample {
	
	WebDriver driver;
	
	@Before
	public void launchApp() throws Exception {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
	}
	
	@After
	public void closeApp() throws Exception {
		
		Thread.sleep(7000);
		driver.close();
		driver.quit();
	}
	
	@Test
	public void verifyLoginFeature() throws Exception {
		//locator ----
//		id
//		name
//		tagname
//		classname
//
//		linkText
//		partialLinktext
//
//		xpath
//		css selector
		
		
		//locator name - username
//		int x = 10;
		WebElement txtUserName = driver.findElement(By.name("username"));
		
		boolean isUserNamePresent = txtUserName.isDisplayed();
		System.out.println(" is username present on page: " + isUserNamePresent);
		txtUserName.sendKeys("Admin");
		
//		driver.findElement(By.name("username")).isDisplayed();
//		driver.findElement(By.name("username")).sendKeys("Admin");;
		
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		
		//tagname
		driver.findElement(By.tagName("button")).click();
		
		
		
		String actualTitle = driver.getTitle();
		
		System.out.println("application URL after login: " + driver.getCurrentUrl());
		System.out.println("application Title after login: " + actualTitle);
		
		//assertion
		Assert.assertEquals("OrangeHRM", actualTitle);			//validation step
		
		
		Thread.sleep(3000);
		
		//Classname
		//Click on user dripdown using classname locator
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		
		Thread.sleep(3000);
		
		
		//LinkText
//		driver.findElement(By.linkText("Logout")).click();			//exact text 
		
		//partialLinkText
		driver.findElement(By.partialLinkText("Logo")).click();
		System.out.println("application URL after logout: " + driver.getCurrentUrl());

		
		
//		driver.findElement(By.partialLinkText("Forgot your passwo")).click();			//tagname ---- p
		
		
		
	}
	

}
