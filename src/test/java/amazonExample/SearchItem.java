package amazonExample;

import org.junit.Test;
import org.openqa.selenium.By;

public class SearchItem extends BaseTest{
	
	
	@Test
	public void verifySearchFeature() {
		
		System.out.println("testing search functionality");
		
		//locator
		
		//ID
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15");
		
		
		
		
//		//XPATH
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
//		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
//		
//		
//		
//		//CSS 
		driver.findElement(By.cssSelector("[value='Go']")).click();
		
		
		System.out.println("***************" + driver.getTitle());
		
	}

}
