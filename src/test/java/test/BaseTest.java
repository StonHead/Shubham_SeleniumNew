package test;


import java.time.Duration;

//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pages.LoginPage;
import utility.Constants;

public class BaseTest {
	

	WebDriver driver;
	Actions act;
	LoginPage lp ;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Constants.nop_app);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		
		
		act = new Actions(driver);
		
		lp = new LoginPage(driver);
		
		
		
	}

	
	@AfterTest
	public void CloseApp() throws Exception {
		
		
		Thread.sleep(7000);
		driver.close();
		driver.quit();
	}
	
	
	
}
