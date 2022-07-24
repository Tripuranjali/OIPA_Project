package com.OIPA_Project.TestCases;



import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OIPA_Project.PageObjects.BaseClass;
import com.OIPA_Project.PageObjects.LoginPage;
import com.aventstack.extentreports.Status;

public class TC_LoginTest_01 extends BaseClass  {
	
	@Test
	public void ClearViewLogoVerification() throws Exception {
		
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
		
		if (driver.findElement(By.xpath("//*[@id='logo']/span/img")).isDisplayed()) {
			captureScreen(driver, "ClearViewLogoVerification");
			Assert.assertTrue(true);
			logger.info("Home Page loaded Successfully");
			
		}
		else {
			captureScreen(driver, "ClearViewLogoVerification");
			logger.info("Logged in but Home page not loaded (OR) Title is mismatched");
			Assert.assertTrue(false);
					
		}
		
		
		
	}
	
}


