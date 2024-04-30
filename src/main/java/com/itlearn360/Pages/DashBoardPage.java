package com.itlearn360.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {

	WebDriver driver;
	//Constructor
	public DashBoardPage(WebDriver lDriver) {
		
		this.driver =  lDriver;
				
		PageFactory.initElements(driver, this);
	}
		@FindBy(css=".lg_button") WebElement dashboardclick;
		@FindBy(css="a[href='https://demo.itlearn360.com/user-profile/Demo12/academies/']") WebElement offeracademics;
		@FindBy(css="body > div:nth-child(65) > div:nth-child(6) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > main:nth-child(1) > article:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > form:nth-child(5) > div:nth-child(1) > button:nth-child(1)") WebElement subscriptionbtn;
	
	public void dashboardClick() {
		
		dashboardclick.click();
		offeracademics.click();
		subscriptionbtn.click();
		
	}
}