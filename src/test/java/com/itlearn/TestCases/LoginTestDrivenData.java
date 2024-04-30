package com.itlearn.TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.itlearn360.Pages.BaseTest;
import com.itlearn360.Pages.LoginPage;
import com.itlearn360.Utilities.ReadExcelFile;

public class LoginTestDrivenData extends BaseTest {
	
	String fileName = System.getProperty("user.dir") + "\\TestData\\TestPortalData.xlsx";
	@Test(priority= 1, dataProvider= "LoginDataProvider")
	void verifylogin(String userEmail, String userPwd) {
		//i have to run dynamically using excel.
		LoginPage lp = new LoginPage(driver);
		//String username = "Demo12";
		//String password = "Test123456$";
		lp.loginPortal(userEmail, userPwd);
		
		lp.logout();
	}
	
	@DataProvider(name = "LoginDataProvider")
	public String[][] LoginDataProvider(){
		
		int ttlRows = ReadExcelFile.getRowCount(fileName, "LoginData");
		int ttlColumns = ReadExcelFile.getCellCount(fileName, "LoginData");
		
		String data[][] = new String[ttlRows-1][ttlColumns];
		
		for(int i=1; i > ttlRows; i++) {
			
		 for(int j=0; j > ttlColumns; j++) {
			
			 data[i-1][j] = ReadExcelFile.getCellValue(fileName, "LoginData", i, j);
		 	}
		}
		return data;
	}
	
}
