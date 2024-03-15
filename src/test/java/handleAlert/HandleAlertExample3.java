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

public class HandleAlertExample3 {

	WebDriver driver;

	@BeforeTest
	public void launchApp() throws Exception {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://thehub.incedoinc.com/learning/Pages/home.aspx");
		
//		driver.get("https://thehub.incedoinc.com/learning/Pages/home.aspx");
		driver.get("https://admin:admin@thehub.incedoinc.com/learning/Pages/home.aspx");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@AfterTest
	public void CloseApp() throws Exception {

		Thread.sleep(7000);
		driver.close();
		driver.quit();
	}

	

	@Test
	public void verifyPromptAlert() throws Exception {

		//driver.findElement(By.xpath("//button[contains(text(),'Prom')]")).click();

		// handle an alert
		// Alert/Frame/Window --------- > driver.switchTo()

		//Alert promptmAlert = driver.switchTo().alert();
		
		//Thread.sleep(5000);
		//promptmAlert.dismiss();
		

	}

}
