package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fruits extends BaseClass { 
	
	@Given("user has to launch the browser and maximize the window")
	public void user_has_to_launch_the_browser_and_maximize_the_window() {
		launchBrowser();
	    WindowMaximize();
	}

	@When("user has to hit the myntra url")
	public void user_has_to_hit_the_myntra_url() {
		launchUrl("https://www.myntra.com/login");
	}

	@When("user has to pass the  valid usernum{string} in phone number field")
	public void user_has_to_pass_the_valid_usernum_in_phone_number_field(String mn) {
		 WebElement mb = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		   mb.sendKeys(mn);
	}

	@When("user has to click the continue button")
	public void user_has_to_click_the_continue_button() {
		 WebElement button = driver.findElement(By.xpath("//div[text()='CONTINUE']"));
		    button.click();
	}

	@Then("user has to close the browser")
	public void user_has_to_close_the_browser() {
		closeEntireBrowser();
	}
}
