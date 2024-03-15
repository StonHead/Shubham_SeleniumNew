package controlExample_JUNit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleInputbox extends BaseTest{
	
	
	
	@Test
	public void verifyInputbox() {
		
		WebElement txt_FirstName = driver.findElement(By.name("fname"));
		
		txt_FirstName.sendKeys("enterFirstname");
		
		
		
		String txt_FirstName_att = txt_FirstName.getAttribute("enabled");
		
		System.out.println("Attribute Value are: " + txt_FirstName_att);
		
	}

}
