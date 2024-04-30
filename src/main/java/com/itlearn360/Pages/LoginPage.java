package com.itlearn360.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	//Constructor
	public LoginPage(WebDriver lDriver) {
			
			this.driver = lDriver;
			PageFactory.initElements(driver, this);	
	}
			//@FindBy(xpath="/html[1]/body[1]/div[1]/div[4]/div[1]/div[1]/section[1]/ul[1]/li[1]/ul[1]/li[4]/a[1]") WebElement search;
			@FindBy(xpath="//*[@id=\"loginlabel\"]") WebElement loginclick;
			@FindBy(name="log") WebElement user;
			@FindBy(id="user_pass") WebElement pass;
			@FindBy(name="wp-submit") WebElement submitbtn;
			// click on loginimage and then click logout
			@FindBy(xpath="/html/body/div[1]/header/div/div/div[2]/div/nav[2]/ul/li[2]/a/i") WebElement logoutimage;
			@FindBy(xpath="/html/body/div[1]/header/div/div/div[3]/div/ul/li[3]/a") WebElement logoutclick;
			
	public void loginPortal(String username, String password) {
	  //public void loginPortal(String userEmail, String userPwd) {
			//search.click();
			loginclick.click();
			user.sendKeys(username);
			pass.sendKeys(password);
			submitbtn.click();
	}
	
	public void logout() {
		
		logoutimage.click();
		logoutclick.click();
	}
}