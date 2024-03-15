package actionExample;

import org.openqa.selenium.By;
//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RightClickDoubleClick {
	
	
	
	WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(7000);
	}

	
	@AfterTest
	public void CloseApp() throws Exception {
		
		
		Thread.sleep(7000);
		driver.close();
		driver.quit();
	}
	
	
	@Test
	public void rightClickTest() throws Exception {
		
		
		WebElement btn_rightClick = driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		WebElement btn_doubleClick = driver.findElement(By.xpath("//button[contains(text(),'Dou')]"));
		
		
		Actions act = new Actions(driver);
		
		//app1
//		act.moveToElement(btn_rightClick).contextClick().perform();
		

		//app2
		act.contextClick(btn_rightClick).perform();
		
		
		
//		WebElement ele_Delete = driver.findElement(By.xpath("//span[contains(text(),'Dele')]"));
//		
//		ele_Delete.click();
//		String alerttext = driver.switchTo().alert().getText();
//		Assert.assertTrue(alerttext.contains("delete"));
//		
//		driver.switchTo().alert().dismiss();
		
	}
	
	
	
	@Test
	public void doubleClickTest() throws Exception {
		
		
		WebElement btn_rightClick = driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		WebElement btn_doubleClick = driver.findElement(By.xpath("//button[contains(text(),'Dou')]"));
		
		
		Actions act = new Actions(driver);
		
		//app1
//		act.moveToElement(btn_doubleClick).doubleClick().perform();
		

		//app2
		act.doubleClick(btn_doubleClick).perform();
		
		
		
//		WebElement ele_Delete = driver.findElement(By.xpath("//span[contains(text(),'Dele')]"));
//		
//		ele_Delete.click();
//		String alerttext = driver.switchTo().alert().getText();
//		Assert.assertTrue(alerttext.contains("delete"));
//		
		
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
		
	}
	
	
	
}
