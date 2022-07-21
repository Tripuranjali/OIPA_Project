package com.OIPA_Project.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);		
	}
	
	@FindBy(id="logonIdentifier")
	@CacheLookup
	WebElement txtusername;
	
	@FindBy(id="password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(id="next")
	@CacheLookup
	WebElement btnsignin;
	
	@FindBy(className="fa-sign-out")
	@CacheLookup
	WebElement btnlogout;
	
	
	
	public void setusername(String email) {
		txtusername.sendKeys(email);		
	}
	public void setpassword(String password) {
		txtpassword.sendKeys(password);		
	}
	public void clicksignin() {
		btnsignin.click();		
	}
	
	public void clicklogout() {
		btnlogout.click();
	}
	

}
