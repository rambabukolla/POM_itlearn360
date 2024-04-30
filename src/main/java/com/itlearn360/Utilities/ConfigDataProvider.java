package com.itlearn360.Utilities;



import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	Properties prop;
	
	public ConfigDataProvider() {
		
		File src = new File("E:\\Backup 17-04-2024\\eclipse-workspace\\POM_itlearn360\\Configuration\\config.properties");
		
		try {
			
		FileInputStream fis = new FileInputStream(src);
		prop = new Properties();
		prop.load(fis);
		}catch(Exception e) {
			System.out.println("Not able to load config file" + e.getMessage());
		}
	}
	
	public String getBrowser() {
		
		return prop.getProperty("browser");
	}
		
	public String getstagingurl() {
		
		return prop.getProperty("testsiteurl");
	}
	
}
