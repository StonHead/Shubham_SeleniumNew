package datePickerExample;

import java.time.Duration;
import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ex2_DatePickerExample {

    @Test

    public void dateTimePicker(){

    	//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("http://demo.automationtesting.in/Datepicker.html");

        //Find the date time picker control

        WebElement dateBox = driver.findElement(By.xpath("//input[@class='form-control is-datepick']"));

        //Fill date as mm/dd/yyyy as 09/25/2021

        dateBox.sendKeys("09/25/2021");

        //Press tab to shift focus to time field

        dateBox.sendKeys(Keys.TAB);

        

    }

    }