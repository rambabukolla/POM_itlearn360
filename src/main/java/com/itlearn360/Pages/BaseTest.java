package com.itlearn360.Pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.itlearn360.Utilities.ConfigDataProvider;

import zmq.Config;

public class BaseTest {

	public WebDriver driver;
	public ConfigDataProvider config = new ConfigDataProvider();
	
	//Right click on current/desired package then Select TestNG then select & click on Create TestNG.
	@BeforeClass
	public void setUp() {
		
		driver = BrowserFactory.startApplication(driver, config.getBrowser(), config.getstagingurl());
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		
		//BrowserFactory.quitBrowser(driver);
	}
	
}
