package ddtExample;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginApp extends BaseTest{
	
	
	
//	@Test(dataProvider = "smokeTestData")
	@Test(dataProvider = "regressionData")
	public void verifyLoginFeature(String user, String pass) throws Exception {
		
		Thread.sleep(2000);
		
		System.out.println("======================================");
		
		System.out.println("============="+ user + " : " + pass + "=========================");
		
		System.out.println("======================================");
		
		driver.findElement(By.id("Email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys(user);
		
		driver.findElement(By.id("Password")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys(pass);
		
		
		//click on checkbox
//		driver.findElement(By.id("RememberMe")).click();
		
		Thread.sleep(2000);
		//click on Login Button
		driver.findElement(By.tagName("button")).click();
		
		Thread.sleep(2000);
		//validation
//		driver.getPageSource();
		Assert.assertTrue(driver.getPageSource().contains("Login was unsuccessful"));
		
		
	}
	
	
	
	@DataProvider
	public Object[][] smokeTestData() {
		
		//Read data from excel file/csv file   ---- sheet1
		
		Object[][] data = { {"rishi@yahoomail.com", "welcome"}, {"Lovneet@gmail.com", "welcome"}, {"Jyoti@google.com", "Demo@123"}};
		
		return data;
		
		
	}
	
	
	@DataProvider
	public Object[][] regressionData() {
		
		//Read data from excel file/csv file
		
		Object[][] data = { {"rishi_regression@yahoomail.com", "welcome"}, {"Lovneet_regression@gmail.com", "welcome"}, {"Jyoti_regression@google.com", "Demo@123"}};
		
		return data;
		
		
	}
	

}
