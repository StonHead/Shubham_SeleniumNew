package pagesWithoutPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver rdriver) {

		// line of code executed
		// this.driver = driver;

		driver = rdriver;

	}

	// Identification
	By txtEmail = By.id("Email");
	By txtpass = By.cssSelector("input#Password");
	By chk_rem = By.cssSelector("input#RememberMe");
	By btnLogin = By.tagName("button");
	By btnLogout = By.partialLinkText("Logo");

	
	
	
	// methods/actions

	public void enterEmail(String email) {
		driver.findElement(txtEmail).clear();
		driver.findElement(txtEmail).sendKeys(email);

	}

	public void enterpass(String pwd) {
		driver.findElement(txtpass).clear();
		driver.findElement(txtpass).sendKeys(pwd);

	}

	public void clickRememberMeCheckbox() {

		driver.findElement(chk_rem).click();
	}

	public void clickLogin() {

		driver.findElement(btnLogin).click();
	}

	public void clickLogout() {

		driver.findElement(btnLogout).click();
	}
	
	
	public void verifyApplicationTitle(String expTitle) throws Exception {

		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), expTitle);
		
		
	}

}
