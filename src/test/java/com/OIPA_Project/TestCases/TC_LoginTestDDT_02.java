package com.OIPA_Project.TestCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.OIPA_Project.PageObjects.BaseClass;
import com.OIPA_Project.PageObjects.LoginPage;
import com.OIPA_Project.Utilities.XLUtils;

public class TC_LoginTestDDT_02 extends BaseClass {
	
	@Test(dataProvider="LoginData")	
	public void loginDDT(String uname, String pwd) throws InterruptedException {
		
		LoginPage lp=new LoginPage(driver);
		lp.setusername(uname);
		logger.info("UserName Entered Successfully");
		lp.setpassword(pwd);
		logger.info("Password Entered Successfully");
		lp.clicksignin();
		logger.info("Logged in  Successfully");
		driver.manage().window().maximize();
		
		Thread.sleep(15000);
		
		lp.clicklogout();
		
		Thread.sleep(25000);
		
		
		
		
	}
	
	@DataProvider(name="LoginData")
	String[][] getData() throws IOException
	{
		String Path=System.getProperty("user.dir")+"/src/test/java/com/OIPA_Project/TestData/SITCreds.xlsx";
		int rowscount=XLUtils.getRowCount(Path, "Sheet1");
		int colcount=XLUtils.getCellCount(Path, "Sheet1", 1);
		
		String logindata[][]=new String[rowscount][colcount];
		
		for (int i=1;i<=rowscount;i++) {
			for (int j=0;j<colcount;j++) {
				logindata[i-1][j]=XLUtils.getCellData(Path, "Sheet1", i, j);
			}
		}
//		System.out.println(rowscount);
//		System.out.println(colcount);
	return logindata;
	}

}
