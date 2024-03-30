package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Orange extends BaseClass{
	
	@Given("To Launch Edge browser and maximize windows")
	public void to_Launch_Edge_browser_and_maximize_windows() {
		launchBrowser();
		   WindowMaximize();
	}
	@When("To Launch Url browser of the amazon application")
	public void to_Launch_Url_browser_of_the_amazon_application() {
		 launchUrl("https://www.amazon.in/");
	}
	@When("To click the login button")
	public void to_click_the_login_button() {
		WebElement signin = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		   signin.click();
	}
	@When("To pass valid username in email field")
	public void to_pass_valid_username_in_email_field(String em) {
		WebElement email = driver.findElement(By.id("ap_email"));
		   email.sendKeys(em);
	}
	@When("To click the continue button")
	public void to_click_the_continue_button() {
		WebElement button = driver.findElement(By.id("continue"));
	    button.click();
	}
	@When("To check whether navigate to the home or not")
	public void to_check_whether_navigate_to_the_home_or_not() {
	  System.out.println("To check your login credentials");
	}
	@Then("to close browser")
	public void to_close_browser() {
	   closeEntireBrowser();
	}
	
}
