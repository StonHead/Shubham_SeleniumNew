package log4JExample;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginApp extends BaseTest{
	
	
	@Test
	public void verifyLoginFeature() throws Exception {
		
		log.info("clear the email details");
		driver.findElement(By.id("Email")).clear();
		
		Thread.sleep(2000);
		log.info("enter email details from config file: " + conf.getAdminUser());
		driver.findElement(By.id("Email")).sendKeys(conf.getAdminUser());
		
		
		log.info("clear the pass details");
		driver.findElement(By.id("Password")).clear();
		
		Thread.sleep(2000);
		log.info("enter pass details from config file: " + conf.getAdminPass());
		driver.findElement(By.id("Password")).sendKeys(conf.getAdminPass());
		
		
		log.info("click on checkbox");
		driver.findElement(By.id("RememberMe")).click();
		
		
		
		log.info("click on loginButton");
		
		driver.findElement(By.tagName("button")).click();
		log.info("===============Validation Step after login=============");
		log.info(driver.getTitle());
		
		
		log.info("click on Logout Button");
		driver.findElement(By.partialLinkText("Logo")).click();
		log.info("===============Validation Step after logout=============");
		log.info(driver.getTitle());
		
	}

}
