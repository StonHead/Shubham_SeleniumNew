package datePickerExample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Ex4_DatePickerTests_Function {
	public static WebDriver driver;

	@Test
	public void turkishAirlinesDatePicker() throws Exception {

		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		// Click and open the Date Picker
		driver.findElement(By.id("datepicker")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ui-datepicker-title")));

		selectDate("4", "October", "2025");
	}

	public static String[] getMonthYear(String monthYearValue) {
		return monthYearValue.split(" ");
	}

	public static void selectDate(String exDay, String exMonth, String exYear) {
		
		if(exMonth.equals("February") && Integer.parseInt(exDay) > 29) {
			System.out.println("Wrong Date: " + exMonth + " : " + exDay);
			return ;
			
		}
		
		if(Integer.parseInt(exDay)> 31) {
			System.out.println("Wrong Date: " + exMonth + " : " + exDay);
			return ;
			
		}
		
		String YearMonthValue = driver.findElement(By.className("ui-datepicker-title")).getText();
		
		
		while (!(getMonthYear(YearMonthValue)[0].equalsIgnoreCase(exMonth) &&  getMonthYear(YearMonthValue)[1].equals(exYear))) {

			driver.findElement(By.xpath("//a[@title='Next']")).click();
			YearMonthValue = driver.findElement(By.className("ui-datepicker-title")).getText();

		}

		driver.findElement(By.xpath("//a[text()='" + exDay + "']")).click();

	}
}