package nopComm;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Constants;
import utility.ReadConfig;

public class BaseTest {
	
	//pre-condition  ----- before
	//test
	//post-condition
	WebDriver driver;
	ReadConfig conf ;
	
	@Before
	public void launchApp() throws Exception {
		
		
		System.out.println("launching an application");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
//		driver.get(Constants.amazonApp);
		
		conf = new ReadConfig();
		driver.get(conf.getAppURL());
		
		
		System.out.println("=============static method=====================" + ReadConfig.getAppURL());
		
		Thread.sleep(5000);
	}

	
	@After
	public void CloseApp() throws Exception {
		
		//conf.getAppURL();
		
		System.out.println("closing an application");
		Thread.sleep(7000);
		driver.close();
		driver.quit();
	}
	
	
	
}
