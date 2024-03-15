package amazonExample;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Constants;

public class BaseTest {
	
	//pre-condition  ----- before
	//test
	//post-condition
	WebDriver driver;
	
	@Before
	public void launchApp() throws Exception {
		
		
		System.out.println("launching an application");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//Constants.amazonApp = "https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java";
		
		driver.get(Constants.amazonApp);
		Thread.sleep(5000);
	}

	
	@After
	public void CloseApp() throws Exception {
		
		
		System.out.println("closing an application");
		Thread.sleep(7000);
		driver.close();
		driver.quit();
	}
	
	
	
}
