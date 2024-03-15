package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {

	static Properties prop;

	public ReadConfig() throws Exception {

		System.out.println("=============inside ReadConfig constructor=================");

		FileInputStream fis = new FileInputStream("./testData/config.properties");

		prop = new Properties();

		prop.load(fis);

//		System.out.println("****************" +prop.getProperty("nopApp"));

	}

	public static String getAppURL() {

		return prop.getProperty("nopApp");

	}

	public String getAdminUser() {

		return prop.getProperty("nop_admin_user");

	}

	public String getAdminPass() {

		return prop.getProperty("nop_admin_pass");

	}

}
