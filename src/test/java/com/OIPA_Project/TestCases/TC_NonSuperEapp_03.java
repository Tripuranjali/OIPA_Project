package com.OIPA_Project.TestCases;

import org.testng.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.Color;

import org.testng.annotations.Test;

import com.OIPA_Project.PageObjects.BaseClass;
import com.OIPA_Project.PageObjects.LoginPage;
import com.OIPA_Project.PageObjects.NonSuperEappPage;

public class TC_NonSuperEapp_03  extends BaseClass {	
	
	@Test
	public void NonSuperEappSubmission() throws  Exception {			
		
		
		driver.get(SITURL);
		logger.info("SIT URL Launched");
		Thread.sleep(5000);
		
		LoginPage lp = new LoginPage(driver);
		lp.setusername(UserName);
		logger.info("UserName Entered Successfully");
		
		lp.setpassword(PassWord);
		logger.info("Password Entered Successfully");
		
		lp.clicksignin();
		logger.info("Logged into IE - SIT Successfully");
		
		Thread.sleep(20000);
		
		driver.manage().window().maximize();
		
		NonSuperEappPage Ns = new NonSuperEappPage(driver);		
		Ns.clicknewquote();
		logger.info("New Quote clicked Successfully");
		Thread.sleep(5000);
		
		Ns.clickstartadviser();
		logger.info("Adviser selected Successfully");
		Thread.sleep(10000);
		
		Ns.setfirstname("Automation");
		logger.info("FirstName entered Successfully");
		
		Ns.setlasttname("Demo");
		logger.info("LastName entered Successfully");
		
		Ns.clickgender();
		logger.info("Gender selected Successfully");
		
		Ns.clicksmoker();
		logger.info("Smokerstatus selected Successfully");
		Thread.sleep(5000);
		
		Ns.setbirthdate("21071988");
		logger.info("Birthdate entered Successfully");
		
		
		
		Ns.clickInsstate();		
		Ns.selectstate();
		logger.info("state selected Successfully");
		
		
		Ns.setoccupation("Chiropractor - qualified and registered");		
		logger.info("Occupation selected Successfully");
		Thread.sleep(5000);
		
		Ns.setannualincome("900000");
		Thread.sleep(4000);
		logger.info("Annual Income entered Successfully");
		
		
		Ns.clickpurpofapp();
		Ns.selectpurpofapp();
		Thread.sleep(2000);
		logger.info("purpose of app selected Successfully");
		
		Ns.clickownerapp();
		Ns.selectownership();
		Thread.sleep(5000);
		logger.info("Non Super Ownership selected Successfully");
		
		
		Ns.clickempstat();
		Ns.selectemploymentstat();
		Thread.sleep(8000);
		logger.info("Employment status selected Successfully");
		
		Ns.selectlife();
		Thread.sleep(10000);
		logger.info("Life cover selected Successfully");
		
		Ns.enterbenamount("800000");
		Thread.sleep(5000);
		logger.info("Life cover Benefit amount entered Successfully");
		
		
		Ns.premiumtype();
		Ns.selectpremtype();		
		logger.info("Life cover Premium type selected Successfully");
		
		Thread.sleep(5000);	
		

		
		Ns.coverheld();
		logger.info("Life cover selected as Outside Super Successfully");
		
		Thread.sleep(3000);
		
		Ns.poctype();
		Ns.selectpoctype();
		logger.info("Life cover purpose selected  Successfully");
		
			
		Ns.calculatepremium();
		Thread.sleep(13000);
		logger.info("Premium calculated Successfully");
		
		
		Ns.savebutton();
		Thread.sleep(5000);
		logger.info("Quote created successfully");
		
		Ns.applybtn();
		Thread.sleep(10000);
		logger.info("Proceeded to apply");
		
		Ns.eappproceed();
		Thread.sleep(10000);
		logger.info("Proceeded to eapp");
		
		Ns.checkconsent();
		Ns.yesconsent();
		Thread.sleep(10000);
		
		Ns.twosave();
		Thread.sleep(15000);
		
		Ns.onenext();		
		logger.info("Cover section verified successfully");
		Thread.sleep(15000);		
		
		
		Ns.Institleset();
		Ns.selecttitle();
		Thread.sleep(10000);
		
		Ns.Insaddset("150 KAHIBAH RD, CHARLESTOWN NSW 2290");
		Thread.sleep(15000);
		
		Ns.Insmailingaddset();
		Thread.sleep(12000);
		
		Ns.Insnumhome("7989787119");
		Thread.sleep(1000);
		Ns.Insnumwork("7989787119");
		Thread.sleep(1000);
		Ns.Insnummobile("7989787119");
		Thread.sleep(1000);
		
		Ns.Insemailset("A.R@gmail.com");
		
		Thread.sleep(10000);
		
		Ns.twonext();
		Thread.sleep(15000);
		
		WebElement Insgreen=driver.findElement(By.xpath("//*[@id='question-page-pageInsured']/li/a/span[1]"));
		String s=Insgreen.getCssValue("color");
		String hexcols = Color.fromString(s).asHex();
		
		if(hexcols.equals("#48cc06")) {
			TC_NonSuperEapp_03.captureScreen(driver,"Insured Section");
			Assert.assertTrue(true);
			logger.info("Insured Section verified Successfully");
			}
		else{
			Ns.gotofinalise();
			Thread.sleep(5000);
			TC_NonSuperEapp_03.captureScreen(driver,"NonSuperEappSubmission");
			logger.info("Insured Section not verified");
			Assert.assertTrue(false);
			}
		
		Ns.clickownertypeIndividual();
		Thread.sleep(10000);
		
		Ns.clickinsuredasowner();
		Thread.sleep(12000);
		
		Ns.clickownerpurpose();
		Ns.selectownpurp();
		Thread.sleep(10000);
		
		Ns.threenext();
		Thread.sleep(15000);
		
		WebElement ownergreen=driver.findElement(By.xpath("//*[@id='question-page-pageOwners']/li/a/span[1]"));
		String t=ownergreen.getCssValue("color");
		String hexcolt = Color.fromString(t).asHex();
		
		if(hexcolt.equals("#48cc06")) {
			TC_NonSuperEapp_03.captureScreen(driver,"Owner Section");
			Assert.assertTrue(true);
			logger.info("Owner Section verified Successfully");
			}
		else{
			Ns.gotofinalise();
			Thread.sleep(5000);
			TC_NonSuperEapp_03.captureScreen(driver,"NonSuperEappSubmission");
			logger.info("Owner Section not verified");
			Assert.assertTrue(false);
			}
		
		Ns.Nobeneficiaryselection();
		Thread.sleep(10000);
		
		Ns.fournext();
		Thread.sleep(15000);
		
		WebElement Bengreen=driver.findElement(By.xpath("//*[@id='question-page-pageBeneficiaries']/li/a/span[1]"));
		String u=Bengreen.getCssValue("color");
		String hexcolu = Color.fromString(u).asHex();
		
		if(hexcolu.equals("#48cc06")) {
			TC_NonSuperEapp_03.captureScreen(driver,"Beneficiary Section");
			Assert.assertTrue(true);
			logger.info("Beneficiary Section verified Successfully");
			}
		else{
			Ns.gotofinalise();
			Thread.sleep(5000);
			TC_NonSuperEapp_03.captureScreen(driver,"NonSuperEappSubmission");
			logger.info("Beneficiary Section not verified");
			Assert.assertTrue(false);
			}
		
		
		
		Ns.clickannualfrequency();
		Thread.sleep(10000);
		
		Ns.clickBpaymethod();
		Ns.selectpaymentmethod();
		Thread.sleep(4000);
		
		Ns.fivenext();
		Thread.sleep(15000);
		
		WebElement Paygreen=driver.findElement(By.xpath("//*[@id='question-page-pagePayments']/li/a/span[1]"));
		String v=Paygreen.getCssValue("color");
		String hexcolv = Color.fromString(v).asHex();
		
		if(hexcolv.equals("#48cc06")) {
			TC_NonSuperEapp_03.captureScreen(driver,"Payment section");
			Assert.assertTrue(true);
			logger.info("Payment Section verified Successfully");
			}
		else{
			Ns.gotofinalise();
			Thread.sleep(5000);
			TC_NonSuperEapp_03.captureScreen(driver,"NonSuperEappSubmission");
			logger.info("Payment Section not verified");
			Assert.assertTrue(false);
			}
		
		
		
		
		Ns.sixnext();
		Thread.sleep(15000);
		
		WebElement Advgreen=driver.findElement(By.xpath("//*[@id='question-page-pageAdvisers']/li/a/span[1]"));
		String w=Advgreen.getCssValue("color");
		String hexcolw = Color.fromString(w).asHex();
		
		if(hexcolw.equals("#48cc06")) {
			TC_NonSuperEapp_03.captureScreen(driver,"Adviser section");
			Assert.assertTrue(true);
			logger.info("Adviser Section verified Successfully");
			}
		else{
			Ns.gotofinalise();
			Thread.sleep(5000);
			TC_NonSuperEapp_03.captureScreen(driver,"NonSuperEappSubmission");
			logger.info("Adviser Section not verified");
			Assert.assertTrue(false);
			}
		
		
		
		Ns.declarationone();
		Thread.sleep(10000);
		
		Ns.declarationtwo();
		Thread.sleep(10000);
		
		Ns.declarationthree();
		Thread.sleep(10000);
		
		Ns.declarationfour();
		Thread.sleep(10000);
		
		Ns.declarationfive();
		Thread.sleep(10000);
		
		Ns.declarationsix();
		Thread.sleep(10000);
		
		Ns.declarationseven();
		Thread.sleep(10000);	
		

		
		Ns.sevennext();
		Thread.sleep(10000);
		
		WebElement Decgreen=driver.findElement(By.xpath("//*[@id='question-page-pageDeclarations']/li/a/span[1]"));
		String x=Decgreen.getCssValue("color");
		String hexcolx = Color.fromString(x).asHex();
		
		if(hexcolx.equals("#48cc06")) {
			TC_NonSuperEapp_03.captureScreen(driver,"Declaration Section");
			Assert.assertTrue(true);
			logger.info("Declaration Section verified Successfully");
			}
		else{
			Ns.gotofinalise();
			Thread.sleep(5000);
			TC_NonSuperEapp_03.captureScreen(driver,"NonSuperEappSubmission");
			logger.info("Declaration Section not verified");
			Assert.assertTrue(false);
			}
		
		
		
		Ns.scanandattachclick();
		Thread.sleep(5000);
		Ns.clearviewteamclick();
		Thread.sleep(3000);
		Ns.eightnext();
		Thread.sleep(10000);
		
		WebElement personalstatementgreen=driver.findElement(By.xpath("//*[@id='question-page-pagePersonalStatement']/li/a/span[1]"));
		String y=personalstatementgreen.getCssValue("color");
		String hexcoly = Color.fromString(y).asHex();
	
		if(hexcoly.equals("#48cc06")) {
			TC_NonSuperEapp_03.captureScreen(driver,"Person statement section");
			Assert.assertTrue(true);
			logger.info("Personal statement Section verified Successfully");
			}
		else{
			Ns.gotofinalise();
			Thread.sleep(5000);
			TC_NonSuperEapp_03.captureScreen(driver,"NonSuperEappSubmission");
			logger.info("Personal statement Section not verified");
			Assert.assertTrue(false);
			}
		
		
		
		
		Ns.submiteappdone();
		Thread.sleep(25000);
		
		Ns.NoPdfrequired();
		Thread.sleep(10000);
		
		if(driver.getPageSource().contains("Congratulations! The eApp has been successfully signed and submitted")) {
			Assert.assertTrue(true);
			captureScreen(driver,"NonSuperEappSubmission");
			logger.info("Non Super Eapp Submitted to OIPA Succesfully");
			
		}
		else {
			captureScreen(driver,"NonSuperEappSubmission");
			logger.info("Non Super Eapp Submission Failed");
			Assert.assertTrue(false);
		}

			
				
			
		
	}				
				
	
		
		
}


		
		
		
		
		
		
	

		
	
		
		

		
	
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	



