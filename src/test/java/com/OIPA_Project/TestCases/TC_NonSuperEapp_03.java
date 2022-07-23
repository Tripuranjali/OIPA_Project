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
	public void NonSuperEapp() throws  Exception {
		
		logger.info("SIT URL Launched");
		Thread.sleep(12000);
		
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
		
		Ns.setfirstname("ABCD");
		logger.info("FirstName entered Successfully");
		
		Ns.setlasttname("EFGH");
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
		
		Thread.sleep(10000);	
		
		
		Ns.calculatepremium();
		Thread.sleep(12000);
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
		Thread.sleep(10000);
		
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
		
		Ns.Insnumoneset("7989787119");		
		Ns.Insnumtwoset("7989787119");
		Ns.Insnumthreeset("7989787119");
		
		Ns.Insemailset("A.R@gmail.com");
		Thread.sleep(10000);
		
		Ns.twonext();
		Thread.sleep(10000);	

		
		
		WebElement Insgreen=driver.findElement(By.xpath("//*[@id='question-page-pageInsured']/li/a/span[1]"));
		WebElement checkfinalisesubmit=driver.findElement(By.xpath("//*[@id='question-page-completed']/li/a/span[1]"));
		String s=Insgreen.getCssValue("color");
		String hexcol = Color.fromString(s).asHex();
		if(hexcol.equals("#48cc06")) {
			Assert.assertTrue(true);
			logger.info("Insured Section verified Successfully");
			}
		else{
			checkfinalisesubmit.click();
			Thread.sleep(5000);
			captureScreen(driver,"NonSuperEapp");
			logger.info("Insured Section not verified");
			Assert.assertTrue(false);
			}
			
				
			
		
	}				
				
	
		
		
}


		
		
		
		
		
		
	

		
	
		
		

		
	
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	



