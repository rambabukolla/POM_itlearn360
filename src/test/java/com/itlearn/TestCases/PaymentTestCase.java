package com.itlearn.TestCases;

import org.testng.annotations.Test;

import com.itlearn360.Pages.BaseTest;
import com.itlearn360.Pages.DashBoardPage;
import com.itlearn360.Pages.LoginPage;
import com.itlearn360.Pages.PaymentPage;
import com.itlearn360.Utilities.ReadExcelFile;

public class PaymentTestCase extends BaseTest{
	
	String filename = System.getProperty("user.dir") + "\\TestData\\TestPortalData.xlsx";
	@Test(priority = 1)
	void testcourse() {
		
		LoginPage lp = new LoginPage(driver);
		String username = ReadExcelFile.getCellValue(filename, "LoginData", 1, 2);
		String password = ReadExcelFile.getCellValue(filename, "LoginData", 1, 1);
		lp.loginPortal(username, password);
		
		DashBoardPage dp = new DashBoardPage(driver);
		dp.dashboardClick();
		
		PaymentPage pp = new PaymentPage(driver);
		//String cardnum = ReadExcelFile.getCellValue(filename, "CardDetails", 0, 0);
		String expdate = ReadExcelFile.getCellValue(filename, "CardDetails", 0, 1);
		String cvc = ReadExcelFile.getCellValue(filename, "CardDetails", 0, 2);
		//cardnum, 
		pp.PaymentOptions(expdate, cvc);
	}

}
