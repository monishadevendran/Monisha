package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Flipkartlogin extends BaseClass {
	
	@Given("user has to launch the browser and maximize the window")
	public void user_has_to_launch_the_browser_and_maximize_the_window() {
		launchBrowser();
	    WindowMaximize();
	}

	@When("user has to hit the flipkart url")
	public void user_has_to_hit_the_flipkart_url() {
		 launchUrl("https://www.flipkart.com/");
	}

	@When("user has to click the login button")
	public void user_has_to_click_the_login_button() {
		 WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		    login.click();
	}

	@When("user hss to pass the  valid username{string} in email field")
	public void user_hss_to_pass_the_valid_username_in_email_field(String em) {
		 WebElement num = driver.findElement(By.xpath("//input[@type='text']"));
	     num.sendKeys(em);
	}

	@When("user has to click the request otp")
	public void user_has_to_click_the_request_otp() {
		 WebElement button = driver.findElement(By.xpath("//button[text()='Request OTP']"));
		    button.click();
	}

	@Then("user has to close the browser")
	public void user_has_to_close_the_browser() {
		closeEntireBrowser();
	}
}