package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fblogin extends BaseClass{
	@Given("To Launch the chrome browser and maximize window")
	public void to_Launch_the_chrome_browser_and_maximize_window() {
	   launchBrowser();
	   WindowMaximize();
	}

	@When("To Launch the url of the facebook application")
	public void to_Launch_the_url_of_the_facebook_application() {
	   launchUrl("https://en-gb.facebook.com/");
	}

	@When("To pass valid username in email field")
	public void to_pass_valid_username_in_email_field() {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("monishasweety2206@gmail.com");
	}

	@When("To pass valid password in password field")
	public void to_pass_valid_password_in_password_field() {
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("123345");
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		WebElement button = driver.findElement(By.name("login"));
		button.click();
	}

	@When("To check whether navigate to the home or not")
	public void to_check_whether_navigate_to_the_home_or_not() {
	    System.out.println("To check your login credentials");
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		closeEntireBrowser();
	}

}