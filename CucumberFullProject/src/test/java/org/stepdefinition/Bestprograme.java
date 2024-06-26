package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Bestprograme extends BaseClass{
	@Given("user has to launch the browser and maximize the window")
	public void user_has_to_launch_the_browser_and_maximize_the_window() {
		 launchBrowser();
		   WindowMaximize();
	}
	@When("user has to hit the icici bank url")
	public void user_has_to_hit_the_icici_bank_url() {
		launchUrl("https://www.icicibank.com/");
	}
	@When("user has to move to the login button")
	public void user_has_to_move_to_the_login_button() {
		WebElement log = driver.findElement(By.xpath("//span[text()='Login']"));
		moveTheCursor(log);
	}
	@When("user has to click the personal")
	public void user_has_to_click_the_personal() throws InterruptedException {
		Thread.sleep(3000);
		WebElement pers = driver.findElement(By.xpath("//a[text()='Personal ']"));
		pers.click();
	}
	@When("user has to pass valid userid{string} in number field")
	public void user_has_to_pass_valid_userid_in_number_field(String em ) {
		 WebElement user= driver.findElement(By.xpath("(//input[@type='text'])[1]")); 
		   user.sendKeys(em);
	}  
	@When("user has to click the login")
	public void user_has_to_click_the_login() {
		WebElement okay= driver.findElement(By.id("user-id-goahead"));
		  okay.click();
	}
	@Then("user has to close the browser")
	public void user_has_to_close_the_browser() {
		 closeEntireBrowser();
	}

}
