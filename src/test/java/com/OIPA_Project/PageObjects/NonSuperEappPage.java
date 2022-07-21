package com.OIPA_Project.PageObjects;

//import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NonSuperEappPage {
	
	WebDriver ldriver;
	
	public NonSuperEappPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
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
	
//	@FindBy(xpath="//a[@id='eapp-tab']")
//	@CacheLookup
//	WebElement btnapply;
//	
//	@FindBy(xpath="//a[@id='eapp-tab']")
//	@CacheLookup
//	WebElement btnapply;
//	
//	@FindBy(xpath="//a[@id='eapp-tab']")
//	@CacheLookup
//	WebElement btnapply;
//	
//	@FindBy(xpath="//a[@id='eapp-tab']")
//	@CacheLookup
//	WebElement btnapply;
//	
//	@FindBy(xpath="//a[@id='eapp-tab']")
//	@CacheLookup
//	WebElement btnapply;
//	
//	@FindBy(xpath="//a[@id='eapp-tab']")
//	@CacheLookup
//	WebElement btnapply;
//	
	
					
					
					
	
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

	
	
}
	

	
	
	
	
	
	
	
//	
//	public void setbirthdate(){    
//		  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/mm/yyyy");
//		  LocalDate localDate = LocalDate.now();
//		  txtbirthdate.sendKeys(dtf.format(localDate));
//		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	


