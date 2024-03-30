package org.stepdefinition;

import org.base.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fblogin extends BaseClass{
	//cucumberscenerio
	Fbloginpojo f;
		
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
	   f = new Fbloginpojo();
	   passText("Monishasweety2206@gmail.com", f.getEmail());
	}
	@When("To pass valid password in password field")
	public void to_pass_valid_password_in_password_field() {
	    f = new Fbloginpojo();
	    passText("bhavin123", f.getPassword());
	}
	@When("To click the login button")
	public void to_click_the_login_button() {
		 f = new Fbloginpojo();
		clickBtn(f.getLoginBtn());
	}
	@When("To check whether navigate to the home or not")
	public void to_check_whether_navigate_to_the_home_or_not() {
	   f = new Fbloginpojo();
	   System.out.println("To check your login credential");
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
	   closeEntireBrowser();
	}

}
