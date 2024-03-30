package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpojo extends BaseClass {
	
// Non parametrized constructor
	public Fbloginpojo() {
		PageFactory.initElements(driver, this);
	}
	
//	private webelement
	
	@FindBy(id="email")
	private WebElement Email;
	
	@FindBy(xpath="//input[@aria-label='Password']")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement loginBtn;
	
	//Gettersto access webelementoutside the class
	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}	
}
