package com.itlearn.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.itlearn360.Pages.BaseTest;
import com.itlearn360.Pages.LoginPage;
import com.itlearn360.Pages.SearchPage;
import com.itlearn360.Utilities.ReadExcelFile;

public class SearchTestCase extends BaseTest{
	WebDriver driver;
	String fileName = System.getProperty("user.dir") + "\\TestData\\TestPortalData.xlsx";
	@Test(priority = 1) 
	void SearchCourseTest() {
		
		LoginPage lp = new LoginPage(driver);
		String username = ReadExcelFile.getCellValue(fileName, "LoginData", 0, 1);
		String password = ReadExcelFile.getCellValue(fileName, "LoginData", 1, 0);
		((Object) driver).sleep(1000);
		lp.loginPortal(username, password);
		
		SearchPage sp = new SearchPage(driver);
		String searchCourse = ReadExcelFile.getCellValue(fileName, "SearchCourse", 0, 0);
		sp.searchCourse(searchCourse);
	}
	
}