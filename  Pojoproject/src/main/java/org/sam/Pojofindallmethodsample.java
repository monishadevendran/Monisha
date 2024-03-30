package org.sam;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojofindallmethodsample extends BaseClass {
	// Non parametrized constructor
		public  Pojofindallmethodsample() {
			PageFactory.initElements(driver, this);
		}
		
//		private webelement
		
		@FindAll({
			@FindBy(xpath="//input[@id='email']"),
			@FindBy(xpath="//input[@name='email']"),
			@FindBy(xpath="//input[@dta-testid='royal_email']")
		})
		private WebElement varRef;
		
		@FindBy(xpath="//input[@aria-label='Password']")
		private WebElement password;
		
		@FindBy(name="login")
		private WebElement loginBtn;

		//Gettersto access webelementoutside the class
		
		public WebElement getVarRef() {
			return varRef;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getLoginBtn() {
			return loginBtn;
		}
}
