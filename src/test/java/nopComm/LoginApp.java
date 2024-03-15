package nopComm;

import org.junit.Test;
import org.openqa.selenium.By;

public class LoginApp extends BaseTest{
	
	
	@Test
	public void verifyLoginFeature() throws Exception {
		
		
		driver.findElement(By.id("Email")).clear();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("Email")).sendKeys(conf.getAdminUser());
		
		driver.findElement(By.id("Password")).clear();
		
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys(conf.getAdminPass());
		
	}

}
