package controlExample;

import java.util.List;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleCheckbox extends BaseTest{
	
	
	
	@Test
	public void verifyCheckbox() {
		
		
//		//findElement - multiple match ---- by default it perform action on first element
//		WebElement chkBox = driver.findElement(By.cssSelector("input[type='checkbox']"));	//match ---3
//		
//		
//		chkBox.click();
		
		
		
		
		List<WebElement> chkBox = driver.findElements(By.cssSelector("input[type='checkbox']"));					//match ----3
		
		
		
		System.out.println("Checkbox Count: " + chkBox.size());
		Assert.assertEquals(chkBox.size(), 3);
		
		
//		
//		System.out.println("*********************"+ chkBox.get(2).getAttribute("value"));
//		chkBox.get(2).click();
		
		
		
		for (int i = 0; i < chkBox.size(); i++) {
			
			System.out.println("*********************" + (i+1) +  " : "+ chkBox.get(i).getAttribute("value"));
			chkBox.get(i).click();
			
			
		}
		
		
		
	}

}
