package controlExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleDropDown extends BaseTest{
	
	
	
	//@Test
	public void verifyListBox() throws Exception {
		

		WebElement country_list = driver.findElement(By.xpath("//select[@name='FromLB']"));
		
		
		//manage dropdown ---- Class Select
		
		Select list = new Select(country_list);
		
		
		
		
		System.out.println("is dropdown allow multiple selection or not: " + list.isMultiple());
		Assert.assertEquals(list.isMultiple(), true);
		
		Assert.assertTrue(list.isMultiple());
		
//		Assert.assertEquals(driver.getTitle(), "");
		
		System.out.println("*************************"+ driver.getTitle().contains("Testing"));
		Assert.assertTrue(driver.getTitle().contains("Testing"));
		Assert.assertFalse(driver.getTitle().contains("Google"));
		
		
		
		
		//indexing start from 0
		
		list.selectByIndex(0);						//USA
//		list.selectByIndex(2);
//		list.selectByIndex(4);
//		list.selectByIndex(6);
		
		Thread.sleep(2000);
		
		list.selectByValue("India");				//India
		
		Thread.sleep(2000);
		
		list.selectByVisibleText("Spain");				//Spain
		
		
		Thread.sleep(5000);
		
		list.deselectByVisibleText("USA");
		
		list.deselectByValue("Spain");
		
		
		Thread.sleep(5000);
		list.selectByVisibleText("Spain");				//Spain/India
		
		
		list.deselectAll();		
		
		
		Thread.sleep(4000);
		
		list.selectByValue("India");				//India
		list.selectByIndex(5);
		list.selectByIndex(6);
		
		Thread.sleep(2000);
		list.deselectByIndex(6);
		
	}
	
	
	
	
	
	@Test
	public void verifyListBox2() throws Exception {
		

		WebElement carList = driver.findElement(By.xpath("//select"));						//multiple match ----- 3
		
		Select list = new Select(carList);
		System.out.println("is Car dropdown allow multiple selection or not: " + list.isMultiple());		//false
		
		Thread.sleep(3000);
		
		list.selectByIndex(1);					//Saab
		
		Thread.sleep(3000);
		list.selectByValue("USA");				//Volvo
		
		
		Thread.sleep(3000);
		list.selectByVisibleText("Toyota");
	
		
		
		
		
	}

}
