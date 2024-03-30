package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class positiveandnegative extends BaseClass{
	
	@Given("user has to launch the browser and maximize the window")
	public void user_has_to_launch_the_browser_and_maximize_the_window() {
		launchBrowser();
		   WindowMaximize();
	}

	@When("user has to hit the amazon url")
	public void user_has_to_hit_the_amazon_url() {
		 launchUrl("https://www.amazon.in/");
	}

	@When("user has to click the login button")
	public void user_has_to_click_the_login_button() {
		WebElement signin = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		   signin.click();
	}

	@When("user hss to pass the  valid username{string} in email field")
	public void user_hss_to_pass_the_valid_username_in_email_field(String em) {
		WebElement email = driver.findElement(By.id("ap_email"));
		   email.sendKeys(em);
	}

	@When("user has to click the continue button")
	public void user_has_to_click_the_continue_button() {
		WebElement button = driver.findElement(By.id("continue"));
	    button.click();
	}

	@Then("user has to close the browser")
	public void user_has_to_close_the_browser() {
	    closeEntireBrowser();
	}
}
