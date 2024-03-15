package handleAlert;

import java.time.Duration;

//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utility.Constants;

public class BaseTestAlert {
	
	
	//BeforeSuite beforeTest  beforeClass beforeMethod
	//Test
	//After
	
	
	
	WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Constants.SampleAPP);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	
	@AfterTest
	public void CloseApp() throws Exception {
		
		
		Thread.sleep(7000);
		driver.close();
		driver.quit();
	}
	
	
	

	
}
