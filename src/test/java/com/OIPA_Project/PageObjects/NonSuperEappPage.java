package com.OIPA_Project.PageObjects;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.util.List;
//import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;

//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;

public class NonSuperEappPage extends BaseClass  {
	
	public WebDriver ldriver;
	public Logger logger;
	
	
	public NonSuperEappPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		logger=Logger.getLogger("OIPA_Project");
		PropertyConfigurator.configure("log4j.properties");
	}
	
	@FindBy(xpath="//*[@id='boxes-wrapper']/div/div[2]/a/span") // NewOutoe
	@CacheLookup
	WebElement btnnewquote;
	
	@FindBy(xpath="(//button[@id='modal-confirmation-yes'])[3]") // StartAdv
	@CacheLookup
	WebElement btnstartadviser;
	
	@FindBy(id="clients_0__FirstName") // FirstName
	@CacheLookup
	WebElement txtfirstname;
	
	@FindBy(id="clients_0__LastName") // Last Name
	@CacheLookup
	WebElement txtlastname;
	
	@FindBy(xpath="//input[@Value='Female']") // Gender
	@CacheLookup
	WebElement radiogender;

	@FindBy(xpath="//input[@class='non-smoker persistable']") // Gender
	@CacheLookup
	WebElement radiosmoker;	
	
	@FindBy(id="clients_0__BirthDate") // Birth date
	@CacheLookup
	WebElement txtbirthdate;
	
	@FindBy(xpath="//div[@id='clients_0__State_chosen']")
	@CacheLookup
	WebElement clickstate;
	
	
	@FindBy(xpath="(//ul[@class='chosen-results'])[2]/li")
	@CacheLookup
	List <WebElement> state;
	
	@FindBy(id="occupationddl")
	@CacheLookup
	WebElement occupation;
	
	@FindBy(id="AnnualIncome")
	@CacheLookup
	WebElement txtannualincome;
	
	@FindBy(id="ApplicationPurpose_chosen")
	@CacheLookup
	WebElement clickpurposeofapp;
	
	@FindBy(xpath="(//ul[@class='chosen-results'])[4]/li")
	@CacheLookup
	List <WebElement> purposeofapp;
	
	@FindBy(id="OwnershipStructure_chosen")
	@CacheLookup
	WebElement clickownership;
	
	@FindBy(xpath="(//ul[@class='chosen-results'])[5]/li")
	@CacheLookup
	List <WebElement> ownership;
	
	@FindBy(id="EmploymentStatus_chosen")
	@CacheLookup
	WebElement clickempstatus;	
		
	@FindBy(xpath="(//ul[@class='chosen-results'])[6]/li")
	@CacheLookup
	List <WebElement> selectemploymentstatus;
	
	@FindBy(xpath="//*[@id='covers-section']/div/div[1]/span")
	@CacheLookup
	WebElement clicklife;
	
	@FindBy(id="BenefitViewModel_CoverageAmount")
	@CacheLookup
	WebElement txtbenamount;
	
	@FindBy(id="PremiumViewModel_PremiumType_chosen")
	@CacheLookup
	WebElement clickpremtype;
	
	@FindBy(xpath="(//ul[@class='chosen-results'])[8]/li")
	@CacheLookup
	List <WebElement> selectpremtype;
	
	@FindBy(id="CoverPurposeViewModel_CoverPurpose_chosen")
	@CacheLookup
	WebElement purpofcover;
	
	@FindBy(xpath="(//ul[@class='chosen-results'])[9]/li")
	@CacheLookup
	List <WebElement> selectpurpofcov;
	
	@FindBy(xpath="//input[@value='Outside']")
	@CacheLookup
	WebElement radiooutside;
	
	@FindBy(id="case-summary-refresh")
	@CacheLookup
	WebElement calculate;
	
	@FindBy(id="modal-savecase-savebtn")
	@CacheLookup
	WebElement btnsave;
	
	@FindBy(xpath="//a[@id='eapp-tab']")
	@CacheLookup
	WebElement btnapply;
	
	@FindBy(xpath="//input[@id='modal-eApp-paperApp-eApp']")
	@CacheLookup
	WebElement proceedeapp;
	
	@FindBy(xpath="//input[@id='consent-checkbox']")
	@CacheLookup
	WebElement consentcheck;
	
	@FindBy(xpath="(//button[@id='modal-confirmation-yes'])[2]")
	@CacheLookup
	WebElement consentyes;
	
	@FindBy(xpath="//a[@id='save-case-meta-nav']")
	@CacheLookup
	WebElement savetwo;
	
	@FindBy(xpath="//*[@id='navigation-page-section']/div[3]/a")
	@CacheLookup
	WebElement nextone;
	
	@FindBy(xpath="//div[@id='qtnTitle_Templates_AskTitle_117__chosen']")
	@CacheLookup
	WebElement clickInstitle;
	
	@FindBy(xpath="//ul[@class='chosen-results'][1]/li")
	@CacheLookup
	List <WebElement> selecttitle;	
	
	
	@FindBy(xpath="//*[@id='secAddress_Templates_AskAddress_120_']/div/div[2]/div/div[2]/span/input[2]")
	@CacheLookup
	WebElement Insaddress;
	
	@FindBy(xpath="//*[@id='qtnAddressLine1_Templates_AskAddress_120_']")
	@CacheLookup
	WebElement Insaddress1;	
	
	@FindBy(xpath="//*[@id='qtnAddressCity_Templates_AskAddress_120_']")
	@CacheLookup
	WebElement suburb;
	
	@FindBy(xpath="//*[@id='qtnAddressZip_Templates_AskAddress_120_']")
	@CacheLookup
	WebElement postcode;
	
	@FindBy(xpath="//*[@id='qtnMailingAddressSameAsResidential_Templates_MailingAndResidentialAddresses_119_']")
	@CacheLookup
	WebElement Insmailingaddress;
	
	@FindBy(xpath="//*[@id='qtnMobileNumber_Templates_ContactInfo_124_']")
	@CacheLookup
	WebElement Insmobile;
	
	@FindBy(xpath="//*[@id='qtnPhoneNumber_Templates_AskPhone_126_']")
	@CacheLookup
	WebElement Insmobiletwo;
	
	@FindBy(xpath="//*[@id='qtnPhoneNumber_Templates_AskPhone_125_']")
	@CacheLookup
	WebElement Insmobilethree;
	
	@FindBy(xpath="//*[@id='qtnEmail_Templates_AskEmail_127_']")
	@CacheLookup
	WebElement Insemail;
	
	@FindBy(xpath="//*[@id='navigation-page-section']/div[3]/a")
	@CacheLookup
	WebElement nexttwo;
	
	
	

	
	


					
					

	
// Action on Web Elements(Methods)
	
	public void clicknewquote() {
		btnnewquote.click();		
	}
	public void clickstartadviser() {
		btnstartadviser.click();		
	}
	public void setfirstname(String FirstName) {
		txtfirstname.sendKeys(FirstName);		
	}
	
	public void setlasttname(String LastName) {
		txtlastname.sendKeys(LastName);
	}
	
	public void clickgender() {
		radiogender.click();
	}
	
	public void clicksmoker() {
		radiosmoker.click();
	}
	
	public void setbirthdate(String ddmmyyyy) {
		txtbirthdate.sendKeys(ddmmyyyy);
	
	}
	
	public void clickInsstate() {
		clickstate.click();
	
	}
	
	public void selectstate() {
		for (WebElement stype:state) {
			if(stype.getText().equals("New South Wales")) {
				stype.click();
			}
		}	
	
	}
		
	public void setoccupation(String Occupation) {
		occupation.click();
		occupation.sendKeys(Occupation);
		occupation.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		
		
	}	

	
	public void setannualincome(String AnnualIncome) {
		txtannualincome.sendKeys(AnnualIncome);
		
	}
	
	public void clickpurpofapp() {
		clickpurposeofapp.click();
	
	}
	
	public void selectpurpofapp() {
		for (WebElement poatype:purposeofapp) {
			if(poatype.getText().equals("Personal+Business")) {
				poatype.click();
			}
		}	
	
	}	
	

	public void clickownerapp() {
		clickownership.click();
	
	}
	
	public void selectownership() {
		for (WebElement owntype:ownership) {
			if(owntype.getText().equals("Non-Super")) {
				owntype.click();
			}
		}	
	
	}
	
	public void clickempstat() {
		clickempstatus.click();
	
	}
	
	public void selectemploymentstat() {
		for (WebElement emptype:selectemploymentstatus) {
			if(emptype.getText().equals("Self-Employed")) {
				emptype.click();
			}
		}	
	
	}
	
	public void selectlife() {
		clicklife.click();
	}
	
	public void enterbenamount(String amount) {
		txtbenamount.sendKeys(amount);
	}
	
	public void premiumtype() {
		clickpremtype.click();
	
	}
	
	public void selectpremtype() {
		for (WebElement premtype:selectpremtype) {
			if(premtype.getText().equals("Level")) {
				premtype.click();
			}
		}	
	
	}
	
	public void poctype() {
		purpofcover.click();
	
	}
	
	public void selectpoctype() {
		for (WebElement purpofcovtype:selectpurpofcov) {
			if(purpofcovtype.getText().equals("Business – Key person capital or revenue")) {
				purpofcovtype.click();
			}
		}	
	
	}
	
	
	public void coverheld() {
		radiooutside.click();
	}
	
	public void calculatepremium() {
		calculate.click();
		
	}
	
	public void savebutton() {
		btnsave.click();
	}
	
	public void applybtn() {
		btnapply.click();
		
	}
	
	public void eappproceed() {
		proceedeapp.click();
		
	}
	
	public void checkconsent() {
		consentcheck.click();
		
	}
	
	public void yesconsent() {
		consentyes.click();
		
	}
	
	public void twosave() {
		savetwo.click();
		
	}
	
	public void onenext() {
		nextone.click();
	}
	
	public void Institleset() {
		clickInstitle.click();
	}
	
	public void selecttitle() {
		for(WebElement titletype: selecttitle) {
			if(titletype.getText().equals("MISS")) {
				titletype.click();
			}
		}
		
	}
	
	
	public void Insaddset(String address) throws InterruptedException {
		Insaddress.sendKeys(address);
		Thread.sleep(5000);
		Insaddress.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	}	
	
	
	public void Insmailingaddset() {
		Insmailingaddress.click();
	}
	
	public void Insnumoneset(String numone) {
		
		Insmobile.clear();
		Insmobile.sendKeys(numone);
	}
	
	public void Insnumtwoset(String numtwo) {
		
		Insmobiletwo.clear();
		Insmobiletwo.sendKeys(numtwo);
	}
	
	public void Insnumthreeset(String numthree) {		
		Insmobilethree.clear();
		Insmobilethree.sendKeys(numthree);
	}
	
	public void Insemailset(String Insemailid) {
		Insemail.sendKeys(Insemailid);
		
		
	}
	
	public void twonext() {
		nexttwo.click();
	}
	
	
	
	


	

			
	
	

		
	
}
		

	
	

	

	
	
	
	
	
	
	
	

		
	
	
	
	
	
	
	
	
	
	
	
	
	


