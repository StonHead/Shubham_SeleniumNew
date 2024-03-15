package crossBrowserTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTestCrossBrowser{
	
	
	@Test
	public void verifyLogin() {
		
		driver.findElement(By.cssSelector("input#Email")).clear();
		driver.findElement(By.cssSelector("input#Email")).sendKeys("admin@yourstore.com");
		
		
		
		driver.findElement(By.cssSelector("input#Password")).clear();;
		driver.findElement(By.cssSelector("input#Password")).sendKeys("admin");
		
		
		driver.findElement(By.cssSelector("input#RememberMe")).click();
		
		
		driver.findElement(By.tagName("button")).click();
		
		
		//validation
		Assert.assertTrue(driver.getTitle().contains("Dashboard"));
		
		
		driver.findElement(By.partialLinkText("Logo")).click();
		
		//validation
		Assert.assertTrue(driver.getTitle().contains("Login"));
		
		
	}

}
