package crossBrowserTest;

import java.time.Duration;

//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import utility.Constants;

public class BaseTestCrossBrowser {
	
	
	//BeforeSuite beforeTest  beforeClass beforeMethod
	//Test
	//After
	
	
	
	WebDriver driver;
	
	
	
	@Parameters("incedo_br")
	@BeforeTest
	public void launchApp(String br) throws Exception {
		
		
		
		//String br = Constants.browser;
		
		System.out.println("fetch value from testNG xml file: " + br); 
		
		if(br.equalsIgnoreCase("CHROME")) {
			
			System.out.println("execution on chrome browser");
			driver = new ChromeDriver();
			
		}
		
		
		else if(br.equalsIgnoreCase("edge")) {
			System.out.println("execution on chrome browser");
			driver = new EdgeDriver();
			
		}
		
		else if(br.equalsIgnoreCase("firefox")) {
			System.out.println("execution on firefox browser");
			driver = new FirefoxDriver();
			
		}
		
		
		else {
			
			//Default execution on chrome browser
			System.out.println("execution on default chrome browser");
			driver = new ChromeDriver();
		}
		
		
		
		
		
//		driver = new EdgeDriver();
		
		
		
		
		
		
		
		
		
		
		driver.manage().window().maximize();
		driver.get(Constants.nopComm);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	
	@AfterTest
	public void CloseApp() throws Exception {
		
		
		driver.close();
		driver.quit();
	}
	
	
	
}
