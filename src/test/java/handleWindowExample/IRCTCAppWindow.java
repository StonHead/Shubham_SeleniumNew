package handleWindowExample;



import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IRCTCAppWindow {
	
	
	
	WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	
	@AfterTest
	public void CloseApp() throws Exception {
		
		
		Thread.sleep(7000);
		driver.close();
		driver.quit();
	}
	
	
	@Test
	public void verifyHotelFeature() throws Exception {
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("parent window: " + parentWindow);
		
		
		//Click on Hotel link
		WebElement eleHotel = driver.findElement(By.partialLinkText("HOTELS"));
		eleHotel.click();
		
		
		
		
		
		Set<String>  allWin = driver.getWindowHandles(); //set ------- unique ----- duplicate not allowed
		System.out.println("window count: " + allWin.size());   
		
		
		
		
//		String win11 = (String) allWin.toArray()[0];
		
		
		String win1 = (String)allWin.toArray()[0];
		String win2 = (String)allWin.toArray()[1];
		
		System.out.println("win1 window: " + win1);    // parentWindow
		System.out.println("win2 window: " + win2);
		
		
		Thread.sleep(5000);
		//Switch to window2
		
		driver.switchTo().window(win2);
		
		System.out.println("Window 2 Title: " + driver.getTitle());
		//click on Login button
		driver.findElement(By.cssSelector("a[data-bs-target=\"#LoginModal\"]")).click();
		
		
		Thread.sleep(5000);
		//Switch to window1
		driver.switchTo().window(win1);
		
		//click on CONTACT US
		driver.findElement(By.partialLinkText("CONTACT")).click();
		
		
		
		Thread.sleep(5000);
		//Switch to window2
		
		driver.switchTo().window(win2);			//Hotel Window
		
		
		//model dialog
		driver.findElement(By.cssSelector("[placeholder=\"User Name\"]")).sendKeys("incedoUser");
		
		
		
		
//		Thread.sleep(5000);
//		//Switch to window1
//		driver.switchTo().window(parentWindow);
//		
//		System.out.println("Switch back to Parent Window: " + driver.getTitle());
		
	}
	
	
	
}
