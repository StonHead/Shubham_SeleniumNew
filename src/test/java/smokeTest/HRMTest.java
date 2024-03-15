package smokeTest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HRMTest {
	
	
	WebDriver driver;
	
	@Before
	public void launchApp() {
		
		//chrome browser launching
//		driver = new ChromeDriver();
		
		
		
//		driver = new EdgeDriver();
		
		
		driver = new FirefoxDriver();
		
		
		
	}
	
	@Test
	public void verifyLoginLogout() throws Exception {
		
		System.out.println("=========login and logout test case===========");
		
		Thread.sleep(3000);
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// driver.manage().window().maximize();
		 Thread.sleep(3000);
		 
		 
		 driver.findElement(By.name("username")).sendKeys("Admin");
		 
		 driver.findElement(By.name("password")).sendKeys("admin123");
		 driver.findElement(By.cssSelector(".oxd-button")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.cssSelector(".oxd-userdropdown-name")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.linkText("Logout")).click();
		 Thread.sleep(5000);
		
	}
	
	
	

}
