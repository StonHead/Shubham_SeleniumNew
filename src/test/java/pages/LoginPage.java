package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver rdriver) {

		// line of code executed
		// this.driver = driver;

		driver = rdriver;
		
		PageFactory.initElements(rdriver, this);

	}

	// Identification
//	By txtEmail = By.id("Email");
//	By txtpass = By.cssSelector("input#Password");
//	By chk_rem = By.cssSelector("input#RememberMe");
//	By btnLogin = By.tagName("button");
//	By btnLogout = By.partialLinkText("Logo");

	
	@FindBy(id = "Email")
	WebElement txt_Email;
	
	
	
	@FindBy(how = How.ID, using = "Email")
	WebElement txt_Email1;
	
	
	
	
	@FindBy(css = "input#Password")
	WebElement txt_Pass;
	
	@FindBy(css = "input#RememberMe")
	WebElement chkRem;
	
	@FindBy(tagName  = "button")
	WebElement btnLogin;
	
	@FindBy(partialLinkText  = "Logo")
	WebElement btnLogout;
	
	
	
	
	
	
	// methods/actions

	public void enterEmail(String email) {
		txt_Email1.clear();
		txt_Email.sendKeys(email);

	}

	public void enterpass(String pwd) {
		txt_Pass.clear();
		txt_Pass.sendKeys(pwd);

	}

	public void clickRememberMeCheckbox() {

		chkRem.click();
	}

	public void clickLogin() {

		btnLogin.click();
	}

	public void clickLogout() {

		btnLogout.click();
	}
	
	
	public void verifyApplicationTitle(String expTitle) throws Exception {

		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), expTitle);
		
		
	}

}
