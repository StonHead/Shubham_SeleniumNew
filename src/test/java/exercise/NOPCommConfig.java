package exercise;

import org.junit.Test;

import utility.ReadConfig;

public class NOPCommConfig {
	
	
	
	@Test
	public void launchApp() throws Exception {
		
		ReadConfig conf = new ReadConfig();
		
		
		
		System.out.println(conf.getAppURL());
		
//		conf.getAppURL();
		
	}

}
