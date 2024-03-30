package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmailpojo extends BaseClass{
	
public  Gmailpojo() {
	PageFactory.initElements(driver, this);
}

@FindBy(xpath = "//input[@type='email']")
private WebElement email;

@FindBy(xpath="//span[text()='Next']")
private WebElement next;

@FindBy(name="Passwd")
private WebElement password;

@FindBy(xpath = "//span[text()='Next']")
private WebElement nxt;

public WebElement getEmail() {
	return email;
}

public WebElement getNext() {
	return next;
}

public WebElement getPassword() {
	return password;
}

public WebElement getNxt() {
	return nxt;
}

}
