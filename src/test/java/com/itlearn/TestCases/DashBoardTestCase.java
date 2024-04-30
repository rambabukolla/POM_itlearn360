package com.itlearn.TestCases;

import org.testng.annotations.Test;

import com.itlearn360.Pages.BaseTest;
import com.itlearn360.Pages.DashBoardPage;
import com.itlearn360.Pages.LoginPage;
import com.itlearn360.Utilities.ReadExcelFile;

public class DashBoardTestCase extends BaseTest{

	
	String fileName = System.getProperty("user.dir") + "\\TestData\\TestPortalData.xlsx";
	@Test(priority =1)
	void dashboardTestCase() {
		
		LoginPage lp = new LoginPage(driver);
		String username = ReadExcelFile.getCellValue(fileName, "LoginData", 1, 0);
		String password = ReadExcelFile.getCellValue(fileName, "LoginData", 1, 1);
		lp.loginPortal(username, password);
		
		DashBoardPage dp = new DashBoardPage(driver);
		String dashboard = ReadExcelFile.getCellValue(fileName, "DashBoardData", 0, 0);
		dp.dashboardClick();
	}


}
