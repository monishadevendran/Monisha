package org.stepdefiniton;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbregpojo extends BaseClass{

    public Fbregpojo() {
	PageFactory.initElements(driver, this);
    }
    
	@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement CreateNewAcc;
	
	@FindBy(xpath = "(//input[@type='text'])[2]") 
	private WebElement firstname;

	@FindBy(name="lastname")
   private WebElement secondname;
	
	@FindBy(name="reg_email__")
	private WebElement Mobilenum;
	
	@FindBy(name="reg_passwd__")
	private WebElement passwd;

	public WebElement getCreateNewAcc() {
		return CreateNewAcc;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getSecondname() {
		return secondname;
	}

	public WebElement getMobilenum() {
		return Mobilenum;
	}

	public WebElement getPasswd() {
		return passwd;
	}
	
	

}
