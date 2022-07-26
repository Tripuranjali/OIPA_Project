package com.OIPA_Project.PageObjects;



import java.util.List;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.CacheLookup;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class NonSuperEappPage extends BaseClass  {
	
	public WebDriver ldriver;

	
	
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
	
	@FindBy(xpath="//*[@id='qtnMailingAddressSameAsResidential_Templates_MailingAndResidentialAddresses_119_']")
	@CacheLookup
	WebElement Insmailingaddress;
	
	@FindBy(xpath="//*[@id='qtnPhoneNumber_Templates_AskPhone_125_']")
	@CacheLookup
	WebElement Insmobilehome;
	
	@FindBy(xpath="//*[@id='qtnPhoneNumber_Templates_AskPhone_126_']")
	@CacheLookup
	WebElement Insmobilework;
	

	
	@FindBy(xpath="//*[@id='qtnMobileNumber_Templates_ContactInfo_124_']")
	@CacheLookup
	WebElement Insmobile;
	

	
	@FindBy(xpath="//*[@id='qtnEmail_Templates_AskEmail_127_']")
	@CacheLookup
	WebElement Insemail;
	
	@FindBy(xpath="//*[@id='navigation-page-section']/div[3]/a")
	@CacheLookup
	WebElement nexttwo;
	
	@FindBy(xpath="//*[@id='uniform-qtnOwnerType_Templates_Owners_AskOwnerType_132__1']")
	@CacheLookup
	WebElement ownertype;
	
	@FindBy(xpath="//*[@id='uniform-qtnInsuredIsOwner_Owners_129_']")
	@CacheLookup
	WebElement insuredasowner;
	
	@FindBy(xpath="//*[@id='qtnOwnerOfPurpose_Templates_Owners_OwnerOfPurposeInfo_140__chosen']")
	@CacheLookup
	WebElement ownerpurpose;
	
	@FindBy(xpath="//ul[@class='chosen-results'][1]/li")
	@CacheLookup
	List <WebElement> selectownerpurpose;
	
	@FindBy(xpath="//*[@id='navigation-page-section']/div[3]/a")
	@CacheLookup
	WebElement nextthree;
	
	@FindBy(xpath="//*[@id='qtnOutsideProvideBeneficiaryLater_Beneficiaries_189_']")
	@CacheLookup
	WebElement nobeneficiary;
	
	@FindBy(xpath="//*[@id='navigation-page-section']/div[3]/a")
	@CacheLookup
	WebElement nextfour;
	
	@FindBy(xpath="//*[@id='qtnPremiumFrequency_Templates_Payments_PaymentSchedule_226__1']")
	@CacheLookup
	WebElement premfreq;
	
	
	@FindBy(xpath="//*[@id='qtnOutsidePaymentMethod_Templates_Payments_PaymentMethod_227__chosen']/a")
	@CacheLookup
	WebElement clickpaymentmethod;
	
	@FindBy(xpath="//ul[@class='chosen-results'][1]/li")
	@CacheLookup
	List <WebElement> selectpaymentmethod;
	
	@FindBy(xpath="//*[@id='navigation-page-section']/div[3]/a")
	@CacheLookup
	WebElement nextfive;
	
	@FindBy(xpath="//*[@id='navigation-page-section']/div[3]/a")
	@CacheLookup
	WebElement nextsix;
	
	@FindBy(xpath="//span/input[@id='qtnDutyOfDisclosureNoMisrepresentationAgree_Declarations_241_']")
	@CacheLookup
	WebElement clickdecone;
	
	@FindBy(xpath="//span/input[@id='qtnInsuredOwnerDeclarationAgree_Declarations_241_']")
	@CacheLookup
	WebElement clickdectwo;
	
	@FindBy(xpath="//span/input[@id='qtnMedicalAuthority1Agree_Declarations_241_']")
	@CacheLookup
	WebElement clickdecthree;
	
	@FindBy(xpath="//span/input[@id='qtnMedicalAuthority2Agree_Declarations_241_']")
	@CacheLookup
	WebElement clickdecfour;
	
	@FindBy(xpath="//span/input[@id='qtnAdviserAgree_Declarations_241__1']")
	@CacheLookup
	WebElement clickdecfive;
	
	
	@FindBy(xpath="//span/input[@id='qtnAdviserAcknowledgement4_Declarations_241_']")
	@CacheLookup
	WebElement clickdecsix;
	
	@FindBy(xpath="//span/input[@id='qtnTargetMarket1_Declarations_241__1']")
	@CacheLookup
	WebElement clickdecseven;	

	
	@FindBy(xpath="//*[@id='navigation-page-section']/div[3]/a")
	@CacheLookup
	WebElement nextseven;
	
	@FindBy(xpath="//*[@id='qtnPersonalStatementMethods_PersonalStatement_243__3']")
	@CacheLookup
	WebElement scanandattach;
	

	@FindBy(xpath="//*[@id='uniform-qtnMedicalExams_PersonalStatement_243__2']")
	@CacheLookup
	WebElement clearviewteam;
	
	@FindBy(xpath="//*[@id='navigation-page-section']/div[3]/a")
	@CacheLookup
	WebElement nexteight;
	
	@FindBy(id="btnSubmit")
	@CacheLookup
	WebElement submiteapp;
	
	
	@FindBy(xpath="//*[@id='question-page-completed']/li/a/span[1]")
	@CacheLookup
	WebElement checkfinalisesubmit;
	
	@FindBy(xpath="//*[@id='modal-yes-no-radio-button-no']")
	@CacheLookup
	WebElement Nopdf;
	
	

	
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
		Thread.sleep(8000);
		Insaddress.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	}	
	
	
	public void Insmailingaddset() {
		Insmailingaddress.click();
	}
	
	public void Insnumhome(String numone) {
		
		Insmobilehome.sendKeys(numone);
	}
	
	public void Insnumwork(String numtwo) {
		
		
		Insmobilework.sendKeys(numtwo);
	}
	
	public void Insnummobile(String numthree) {		
		
		Insmobile.sendKeys(numthree);
	}
	
	public void Insemailset(String Insemailid) {
		Insemail.sendKeys(Insemailid);
		
		
	}
	
	public void twonext() {
		nexttwo.click();
	}
	
	
	public void clickownertypeIndividual() {
		ownertype.click();
	}
	
	public void clickinsuredasowner() {
		insuredasowner.click();
	}
	
	public void clickownerpurpose() {
		ownerpurpose.click();

	}
	
	public void selectownpurp() {
		for(WebElement ownpurptype:selectownerpurpose) {
			if(ownpurptype.getText().equals("Business – Key person capital or revenue")) {
				ownpurptype.click();
			}
		}
	}
	
	
	public void threenext() {
		nextthree.click();
	}
	
	public void Nobeneficiaryselection() {
		nobeneficiary.click();
	}
	
	public void fournext() {
		nextfour.click();
	}
	
	public void clickannualfrequency() {
		premfreq.click();
	}
	
	public void clickBpaymethod() {
		clickpaymentmethod.click();
	}
	
	public void selectpaymentmethod() {
		for(WebElement paymenttype: selectpaymentmethod) {
			if(paymenttype.getText().equals("BPAY")) {
				paymenttype.click();
			}
		}
	}
		
	public void fivenext() {
		nextfive.click();
	}
	
	public void sixnext() {
		nextsix.click();
	}
	
	public void declarationone() {
		clickdecone.click();
	}
	
	public void declarationtwo() {
		clickdectwo.click();
	}
	
	public void declarationthree() {
		clickdecthree.click();
	}
	
	public void declarationfour() {
		clickdecfour.click();
	}
	
	public void declarationfive() {
		clickdecfive.click();
	}
	
	public void declarationsix() {
		clickdecsix.click();
	}
	
	
	public void declarationseven() {
		clickdecseven.click();
	}
	

	
	public void sevennext() {
		nextseven.click();
	}
	
	public void scanandattachclick() {
		scanandattach.click();
	}
	
	public void clearviewteamclick() {
		clearviewteam.click();
	}
	
	public void eightnext() {
		nexteight.click();
	}
	
	public void submiteappdone() {
		submiteapp.click();
	}		
	
	public void gotofinalise() {
		checkfinalisesubmit.click();
	}
	
	public void NoPdfrequired() {
		Nopdf.click();
	}
}
		

	
	

	

	
	
	
	
	
	
	
	

		
	
	
	
	
	
	
	
	
	
	
	
	
	


