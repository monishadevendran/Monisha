package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class positiveandnegative extends BaseClass {

	@Given("To Launch Edge browser and maximize windows")
	public void to_Launch_Edge_browser_and_maximize_windows() {
		launchBrowser();
	    WindowMaximize();
	}

	@When("To Launch Url browser of the myntra application")
	public void to_Launch_Url_browser_of_the_myntra_application() {
		launchUrl("https://www.myntra.com/login");
	}

	@When("To pass valid usernumber in phone number field")
	public void to_pass_valid_usernumber_in_phone_number_field(String mn) {
		 WebElement mb = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		   mb.sendKeys(mn);

	}

	@When("To click the continue button")
	public void to_click_the_continue_button() {
		 WebElement button = driver.findElement(By.xpath("//div[text()='CONTINUE']"));
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
