package excelFileExample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import utility.Constants;
import utility.ExcelUtils;
import utility.ExcelUtils2;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class RegisterStudentExcelTest {
    
	//creating object of ExcelUtils class
//    static ExcelUtils excelUtils = new ExcelUtils();
    
    
    static ExcelUtils2 excelUtils = new ExcelUtils2();
    //ReadPropertyFile readProp = new ReadPropertyFile();
    
    //using the Constants class values for excel file path 
    
    static String excelFilePath =   Constants.Path_TestData + Constants.File_TestData2;
//    static String excelFilePath = Constants.Path_TestData+Constants.File_TestData;    //.\\data\\RegistrationData.xlsx
    
    //String excelFilePath = readProp.getExcelFilePath();
    //static String url = Constants.URL;
    //public static  void main(String args[]) throws IOException, Exception {
    
    
    
    @Test
    public void RegistrationDataDrivernTest() throws Exception {    
    
    	//WebDriverManager.chromedriver().setup();
        //Creating an object of ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        //launching the specified URL
        //driver.get("https://demoqa.com/automation-practice-form");
        driver.get(Constants.URL);
        
        
        
        
        //Identify the WebElements for the student registration form
        WebElement firstName=driver.findElement(By.id("firstName"));
        WebElement lastName=driver.findElement(By.id("lastName"));
        WebElement email=driver.findElement(By.id("userEmail"));
        WebElement genderMale= driver.findElement(By.id("gender-radio-1"));
        WebElement mobile=driver.findElement(By.id("userNumber"));
        WebElement address=driver.findElement(By.id("currentAddress"));
        WebElement submitBtn=driver.findElement(By.id("submit"));
        
        
        
        
        //calling the ExcelUtils class method to initialise the workbook and sheet
        excelUtils.setExcelFile(excelFilePath,"Student");							//.\\data\\RegistrationData.xlsx
//        excelUtils.setExcelFile(excelFilePath,"smokeTest");
       

        //iterate over all the row to print the data present in each cell.
        
       // System.out.println("no. of records: " + excelUtils.getRowCountInSheet());
        
        for(int i=1;i<=excelUtils.getRowCountInSheet();i++)
        
        
        {
        	//Enter the values read from Excel in firstname,lastname,mobile,email,address
        	
        	Thread.sleep(2000);
        	firstName.clear();
        	firstName.sendKeys(excelUtils.getCellData(i,0));
        	lastName.clear();
        	lastName.sendKeys(excelUtils.getCellData(i,1));
        	email.clear();
        	email.sendKeys(excelUtils.getCellData(i,2));
        	mobile.clear();
        	mobile.sendKeys(excelUtils.getCellData(i,3));
        	address.clear();
        	address.sendKeys(excelUtils.getCellData(i,4));
        
        	
        	
        	//Click on the gender radio button using javascript
        	JavascriptExecutor js = (JavascriptExecutor) driver;
        	js.executeScript("arguments[0].click();", genderMale);
       
        	Thread.sleep(2000);
        	//Click on submit button
        	//submitBtn.click();
        	js.executeScript("arguments[0].click();", submitBtn);
        
        	//Verify the confirmation message
            WebElement confirmationMessage = driver.findElement(By.xpath("//div[text()='Thanks for submitting the form']"));
            
            //check if confirmation message is displayed
            if (confirmationMessage.isDisplayed()) {
            	
            	
            	// if the message is displayed , write PASS in the excel sheet using the method of ExcelUtils
            	excelUtils.setCellValue(i,9,"PASS",excelFilePath);
            	
            	
            	
            	
            } 
            
            else {
                //if the message is not displayed , write FAIL in the excel sheet using the method of ExcelUtils
                excelUtils.setCellValue(i,9,"FAIL",excelFilePath);
            }

            //close the confirmation popup
            Thread.sleep(2000);
            WebElement closebtn=driver.findElement(By.id("closeLargeModal"));
            //closebtn.click();
            js.executeScript("arguments[0].click();", closebtn);
         
            //wait for page to come back to registration page after close button is clicked
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        }
        //closing the driver
        driver.quit();
    }
    
}