package handleFrame;

import javax.swing.plaf.synth.SynthOptionPaneUI;

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

public class PayTMApp {
	
	
	
	WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
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
		
		WebElement ele_SignIn = driver.findElement(By.xpath("//span[text()='Sign In']"));

		ele_SignIn.click();
		
		
		WebElement outerFrame = driver.findElement(By.cssSelector("iframe[src*='paytm-web']"));
		
		
		
		Thread.sleep(3000);
		//index
		//name or id
		//WebElement
		driver.switchTo().frame(outerFrame);
		
		
		WebElement innerFrame = driver.findElement(By.cssSelector("#oauth-iframe"));

		Thread.sleep(3000);

		driver.switchTo().frame(innerFrame);
		
//		driver.switchTo().frame("name/id");
//		driver.switchTo().frame(webelement);
		
		String frameHeaderText = driver.findElement(By.cssSelector("[oauth-id='signInTab']")).getText();

		System.out.println("*********************" + frameHeaderText);
		
		
		
		
	}
	
	
	
}
