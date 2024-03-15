package log4JExample;


import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utility.ReadConfig;

public class BaseTest {
	

	WebDriver driver;
	ReadConfig conf ;
	public Logger log;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		
		log = Logger.getLogger("NOP Comm Application");
//		PropertyConfigurator.configure(".\\testData\\log4j.properties");
		
		PropertyConfigurator.configure(".\\testData\\Incedolog.properties");
		
		
		log.info("===============info=======================");
		log.warn("===============warn=======================");
		log.error("===============error=======================");
		
		
		log.info("launching a chrome browser");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
//		driver.get(Constants.amazonApp);
		
		conf = new ReadConfig();
		
		
		log.info("Read application url from config  file: " + conf.getAppURL());
		driver.get(conf.getAppURL());
		
		
		log.info("application launched sucessfully.");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	
	@AfterTest
	public void CloseApp() throws Exception {
		
		//conf.getAppURL();
		
		log.info("closing an application");
		
		
		Thread.sleep(7000);
		driver.close();
		driver.quit();
	}
	
	
	
}
