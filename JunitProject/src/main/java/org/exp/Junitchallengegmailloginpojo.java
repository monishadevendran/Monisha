package org.exp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Junitchallengegmailloginpojo extends BaseClass{

public void Gmailpojo() {
PageFactory.initElements(driver, this);
}

@FindBy(xpath="//input[@type='email']")
private WebElement Email;

@FindBy(xpath="//span[text()='Next']")
private WebElement clickbtn;

public WebElement getEmail() {
	return Email;
}

public WebElement getClickbtn() {
	return clickbtn;
}
}