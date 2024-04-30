package com.itlearn360.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import dev.failsafe.Timeout;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

	public static WebDriver startApplication(WebDriver driver, String browsername, String appurl) {
		
		if(browsername.equals("chrome")) {
			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir" + "\\src\\test\\resources\\executables\\chromedriver.exe"));
			WebDriverManager.chromedriver().setup();
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote--allow--origins=*");
			driver = new ChromeDriver(option);
						
		}else if(browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir" + "//src//geckodriver.exe"));
			driver = new FirefoxDriver();
		}else if(browsername.equals("IE")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir" + "//src//InternetExplorerDriver.exe"));
			driver = new InternetExplorerDriver();
		}else {
			
			System.out.println("We do not support browser");
		}
		
		driver.manage().window().maximize();
		driver.get(appurl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		return driver;
	}
	
	public static void quitBrowser(WebDriver driver) throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
	}
}