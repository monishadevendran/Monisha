package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sim extends BaseClass{
	
	@Given("user has to launch the browser and maximize window")
	public void user_has_to_launch_the_browser_and_maximize_window() {
     launchBrowser();
     WindowMaximize();

	}

	@When("user has to hit the facebook Url")
	public void user_has_to_hit_the_facebook_Url() {
     launchUrl("https://en-gb.facebook.com/");

	}

	@When("user has to pass the data {string} in email field")
	public void user_has_to_pass_the_data_in_email_field(String em) throws InterruptedException {
		Thread.sleep(3000);
		  WebElement email = driver.findElement(By.id("email"));
		    email.sendKeys(em);

	}

	@When("user has to pass the data {string} in password field")
	public void user_has_to_pass_the_data_in_password_field(String pass) {
		WebElement password = driver.findElement(By.name("pass"));
		   password.sendKeys(pass);

	}

	@When("user has to click login button")
	public void user_has_to_click_login_button() {
		 WebElement login = driver.findElement(By.name("login"));
		   login.click();

	}

	@Then("user has to close the browser")
	public void user_has_to_close_the_browser() {
       closeEntireBrowser();

	}
	
}
