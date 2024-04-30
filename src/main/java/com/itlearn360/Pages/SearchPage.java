package com.itlearn360.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchPage{

	WebDriver driver;
	//Contructor
	public SearchPage(WebDriver lDriver) {
		
		this.driver = lDriver;
		
		PageFactory.initElements(driver, this);
	}	
		@FindBy(xpath="//*[@id=\"search_course\"]") WebElement searchInput;
		@FindBy(xpath="/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[2]/div[1]/nav[1]/form[1]/button[1]") WebElement searchbtn;
		
	
	public void searchCourse(String courseName) {

		searchInput.sendKeys(courseName);
		searchbtn.click();
		
		}
	
}
