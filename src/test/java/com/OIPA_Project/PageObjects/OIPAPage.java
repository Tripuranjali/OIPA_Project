package com.OIPA_Project.PageObjects;


import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OIPAPage  {
	
public WebDriver ldriver;

	
	
	public OIPAPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="details-button")
	@CacheLookup
	WebElement clickadvanced;
	
	@FindBy(xpath="//a[@id='proceed-link']")
	@CacheLookup
	WebElement proceedtolink;
	
	
	@FindBy(id="userName")
	@CacheLookup
	WebElement username;
	
	
	@FindBy(id="password")
	@CacheLookup
	WebElement password;
	
	@FindBy(id="submit")
	@CacheLookup
	WebElement Login;
	
	
	@FindBy(id="oj-select-choice-Menu_Search")
	@CacheLookup
	WebElement clickfind;
	
	
	@FindBy(xpath="//ul[@id='oj-listbox-results-Menu_Search']/li/div")
	@CacheLookup
	List <WebElement> appy;
	
	@FindBy(xpath="//*[@id='unifiedsearchinput']")
	@CacheLookup
	WebElement enterappnum;
	
	
	@FindBy(xpath="//*[@id='unifiedSearchIcon']/div")
	@CacheLookup
	WebElement Clicksearch;
	
	@FindBy(xpath="//*[@id='segment']/div/a/span")
	@CacheLookup
	WebElement clickcovers;
	
	@FindBy(xpath="//*[@id='role']/div/a/span")
	@CacheLookup
	WebElement clickroles;
	
	@FindBy(xpath="//*[@id='activities']/div/a/span")
	@CacheLookup
	WebElement clickactivities;
	
	@FindBy(xpath="//*[@id='MenuItem_InquiryName']/div")
	@CacheLookup
	WebElement Inquiryscreenclick;
	
	@FindBy(xpath="//*[@id='ui-id-53']")
	@CacheLookup
	WebElement Leavepage;
	
	
	public void advancedclick() {
		clickadvanced.click();
	}
	
	public void proceedtolinkclick() {
		proceedtolink.click();
		
	}
	
	
	public void setoipausername(String UserName) {
		username.sendKeys(UserName);
		
	}
	
	public void setoipapassword(String PassWord) {
		password.sendKeys(PassWord);
		
	}
	
	public void clicklogin() {
		Login.click();;
		
	}
	
	public void clickfindall() {
		clickfind.click();
		
	}
	
	public void selectapplication() {
		for(WebElement searchtype:appy) {
			if(searchtype.getText().equals("Application")) {
				searchtype.click();
			}
		}
		
	}
	
	public void enterappnumber(String number) {
		enterappnum.click();
		enterappnum.sendKeys(number);
		enterappnum.sendKeys(Keys.ENTER);
	}
	
	public void clicksearchnumber() {
		Clicksearch.click();
	}
	
	
	public void clicksegment() {
		clickcovers.click();
		
	}
	
	public void clickrolescreen() {
		clickroles.click();
		
		
	}
	
	public void clickactivitiescreen() {
		clickactivities.click();
		
		
	}
	
	public void clickinquiryscreen() {
		Inquiryscreenclick.click();
		
	}
	
	public void clickleavepage() {
		Leavepage.click();
	}
	
	
	
	
	

}
