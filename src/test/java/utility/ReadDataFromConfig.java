package utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataFromConfig {

	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fis = new FileInputStream(".\\testData\\config.properties");
		
		
		Properties prop = new Properties();
		
		
		prop.load(fis);
		
		
		String appURL = prop.getProperty("nopApp");
		
		System.out.println("Nop comm application url: " + appURL);
		System.out.println("Nop comm userName: " + prop.getProperty("nop_admin_user"));
		System.out.println("Nop comm password: " + prop.getProperty("nop_admin_pass"));
		

	}

}
