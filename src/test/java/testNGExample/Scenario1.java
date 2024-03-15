package testNGExample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Scenario1 {
	
	//priority
	
	//Testcase
	
	
	//by default priority is 0
	//highest negative number having highest priority
	//if priority is same, execution as per naming conv
	
	
	
	
	
	@Test(priority = 2)
	public void payment() {
		
		System.out.println("payment test case");
		
	}
	
	@BeforeTest
	public void launchApp() {
		
		System.out.println("launching app");
		
	}

	
	@AfterTest
	public void closeApp() {
		
		System.out.println("closing app");
		
	}
	
	@Test
	public void addItem() {
		
		System.out.println("addItem test case");
		
	}
	
	@Test(priority = -100)
	public void login() {
		
		System.out.println("login test case");
		
	}
	
	@Test(priority = 3)
	public void logout() {
		
		System.out.println("logout test case");
		
	}
	
	
	@Test(priority = 1)
	public void updateOrder() {
		
		System.out.println("updateOrder test case");
		
	}
	
	@Test(priority = 1)
	public void cancelOrder() {
		
		System.out.println("cancelOrder test case");
		
	}
	

}
