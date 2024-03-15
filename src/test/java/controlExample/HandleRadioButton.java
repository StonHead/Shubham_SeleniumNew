package controlExample;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleRadioButton extends BaseTest{
	
	
	
	@Test
	public void verifyInputbox() {
		
		WebElement rd_female = driver.findElement(By.cssSelector("[value=\"female\"]"));
		
		
		
		
		System.out.println("Before click: " + rd_female.isSelected());				//false
		
		
		rd_female.click();
		
	
		
		System.out.println("After click: "+ rd_female.isSelected());				//true
		
	}

}
