package com.itlearn.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testtest {

	public static void main(String[] args) {

		WebDriver driver;
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir", "\\src\\test\\resources\\executables\\chromedriver.exe"));
		System.out.println("print: ");
		
		driver.get("amazon.in");
		//driver.findElement("");
		System.out.println("print: " + driver.getTitle());
	}

}
