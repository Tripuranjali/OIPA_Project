package com.OIPA_Project.TestCases;

import com.OIPA_Project.PageObjects.BaseClass;
import com.OIPA_Project.PageObjects.OIPAPage;
import org.testng.annotations.Test;

public class TC_OIPAScreenscheck_04 extends BaseClass {
	
	@Test	
	public void OIPAScreenscheck() throws Exception {
		
		driver.get(OIPASITURL);
		logger.info("OIPA SIT Url Launched");
		
		driver.manage().window().maximize();
		
		Thread.sleep(8000);		
		
		OIPAPage op =new OIPAPage(driver);
		
		op.advancedclick();
		Thread.sleep(8000);	
		op.proceedtolinkclick();
		
		Thread.sleep(60000);
		
		
		op.setoipausername(OIPAUsername);
		op.setoipapassword(OIPAPassword);
		op.clicklogin();
		
		logger.info("OIPA SIT login successful and Home Page Verified");
		Thread.sleep(20000);
		
		op.clickfindall();
		Thread.sleep(5000);
		op.selectapplication();
		Thread.sleep(5000);
		op.enterappnumber("2267");
		Thread.sleep(5000);
		op.clicksearchnumber();		
		Thread.sleep(10000);
		
		
		TC_OIPAScreenscheck_04.captureScreen(driver, "OIPA Application Screen");
		logger.info("OIPA Application Screen Verified");		
		Thread.sleep(5000);
		
		op.clickleavepage();
		
		op.clicksegment();
		Thread.sleep(10000);
		TC_OIPAScreenscheck_04.captureScreen(driver, "OIPA Covers Screen");
		
		op.clickrolescreen();
		Thread.sleep(10000);
		TC_OIPAScreenscheck_04.captureScreen(driver, "OIPA Roles Screen");
		
		
		op.clickactivitiescreen();
		Thread.sleep(10000);
		TC_OIPAScreenscheck_04.captureScreen(driver, "OIPA Activities Screen");
		
		op.clickinquiryscreen();
		Thread.sleep(10000);
		TC_OIPAScreenscheck_04.captureScreen(driver, "OIPA Inquiry Screen");
		
		
		
		
		
	}

}
