package com.OIPA_Project.TestCases;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.OIPA_Project.PageObjects.BaseClass;
import com.OIPA_Project.PageObjects.LoginPage;

public class TC_LoginTest_01 extends BaseClass {
	
	@Test
	public void logintest() throws Exception {
		
		logger.info("SIT URL Launched");
		Thread.sleep(15000);
		
		LoginPage lp = new LoginPage(driver);
		lp.setusername(UserName);
		logger.info("UserName Entered Successfully");
		
		lp.setpassword(PassWord);
		logger.info("Password Entered Successfully");
		
		lp.clicksignin();
		logger.info("Logged into IE - SIT Successfully");
		
		Thread.sleep(25000);
		
		driver.manage().window().maximize();
		
		if (driver.getTitle().equals("InsuranceElements")) {
			
			Assert.assertTrue(true);
			logger.info("Home Page loaded Successfully");
			
		}
		else {
			logger.info("Logged in but Home page not loaded (OR) Title is mismatched");
			Assert.assertTrue(false);
			captureScreen(driver, "logintest");			
		}
		
		
		
	}
	
}


