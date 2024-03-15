package actionExample;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	
	@AfterTest
	public void CloseApp() throws Exception {
		
		
		Thread.sleep(7000);
		driver.close();
		driver.quit();
	}
	
	
	@Test
	public void verifyRegisterStudent() throws Exception {
		
		//Switch to Frame
		WebElement photoFrame = driver.findElement(By.cssSelector("[data-src*='photo']"));
		driver.switchTo().frame(photoFrame);
		
		
		
		//Inside Frame
		WebElement img2 = driver.findElement(By.cssSelector("img[src*='tatras2']"));
		WebElement img3 = driver.findElement(By.cssSelector("img[src*='tatras3']"));
		WebElement img4 = driver.findElement(By.cssSelector("img[src*='tatras4']"));
		WebElement trash = driver.findElement(By.cssSelector("div#trash"));
		
		
		//
		Actions act = new Actions(driver);
		
		//app1
//		act.dragAndDrop(img3, trash).build().perform();
		act.dragAndDrop(img3, trash).perform();
		
		Thread.sleep(1000);
		act.dragAndDrop(img2, trash).perform();
		Thread.sleep(1000);
		
		//app2
		//A convenience method that performs click-and-hold at the location of the source element, 
		//moves to the location of the target element, then releases the mouse.
		
		
		act.clickAndHold(img4).moveToElement(trash).release().perform();
		
		
		
	}
	
	
	
}
