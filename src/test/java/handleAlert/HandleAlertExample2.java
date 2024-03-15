package handleAlert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.Constants;

public class HandleAlertExample2 {

	WebDriver driver;

	@BeforeTest
	public void launchApp() throws Exception {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/91995/Downloads/Test%20(3).html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@AfterTest
	public void CloseApp() throws Exception {

		Thread.sleep(7000);
		driver.close();
		driver.quit();
	}

	// @Test
	public void verifySimpleAlert() throws Exception {

		// Click on Button to generate an alert
		driver.findElement(By.cssSelector("[value=\"Show Me Alert\"]")).click();

		// handle an alert
		// Alert/Frame/Window --------- > driver.switchTo()

		Alert simpleAlert = driver.switchTo().alert();

		// action on Alert
		// Accept ----- OK
		// dismiss ----- Cancel
		// getText
		// sendkeys

		String alertText = simpleAlert.getText();
		System.out.println("Simple Alert Text: " + alertText);
		Assert.assertTrue(alertText.contains("alert message!"));

		Thread.sleep(5000);

//		simpleAlert.accept();

		simpleAlert.dismiss();

	}

	// @Test
	public void verifyConfirmAlert() throws Exception {

		// Click on Button to generate an alert
		driver.findElement(By.xpath("//button[contains(text(),'Conf')]")).click();

		// handle an alert
		// Alert/Frame/Window --------- > driver.switchTo()

		Alert confirmAlert = driver.switchTo().alert();

		// action on Alert
		// Accept ----- OK
		// dismiss ----- Cancel
		// getText
		// sendkeys

		String alertText = confirmAlert.getText();
		System.out.println("Confirm Alert Text: " + alertText);
		Assert.assertTrue(alertText.contains("Press 'OK' or 'Cancel' button!"));

		Thread.sleep(5000);

		confirmAlert.accept();

//		confirmAlert.dismiss();    //click on cancel button

		// Validation Step

		String ok_cancel_validation = driver.findElement(By.cssSelector("#demo")).getText();

		System.out.println("**************" + ok_cancel_validation); // You pressed Cancel!

//		if(ok_cancel_validation.contains("Cancel")) {
//			
//			//pass
//			//custom message
//			
//		}
//		else {
//			
//			//fail
//			//custom message
//		}
		Assert.assertTrue(ok_cancel_validation.contains("OK"));
		Assert.assertFalse(ok_cancel_validation.contains("Cancel"));

	}

	@Test
	public void verifyPromptAlert() throws Exception {

		driver.findElement(By.xpath("//button[contains(text(),'Prom')]")).click();

		// handle an alert
		// Alert/Frame/Window --------- > driver.switchTo()

		Alert promptmAlert = driver.switchTo().alert();

		System.out.println("Prompt Alert text: " + promptmAlert.getText());
		Assert.assertTrue(promptmAlert.getText().contains("Please enter your name:"));

		
		String name = "Rishikesh from Incedo";
		
		
		
		Thread.sleep(5000);
		promptmAlert.sendKeys(name); // observation?
		Thread.sleep(5000);

		promptmAlert.accept();
//		promptmAlert.dismiss();
		
		
		
		String prompt_validation = driver.findElement(By.cssSelector("#demoPrompt")).getText();
		
		System.out.println("**********************" + prompt_validation);
		Assert.assertTrue(prompt_validation.contains(name));

	}

}
