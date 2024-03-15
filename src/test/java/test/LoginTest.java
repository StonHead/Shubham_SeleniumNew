package test;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	
	@Test
	public void verifyLoginFeature() throws Exception {
		
	
		
		lp.enterEmail("admin@yourstore.com");
		lp.enterpass("admin");
		lp.clickRememberMeCheckbox();
		lp.clickLogin();
		
		
		lp.verifyApplicationTitle("Dashboard / nopCommerce administration");
		lp.clickLogout();
		lp.verifyApplicationTitle("Your store. Login");
		

		
	}

}
