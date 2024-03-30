package org.stepdefiniton;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class Fbregistration extends BaseClass {
     //with header
	@Given("To Launch the browsser and maximize the window")
	public void to_Launch_the_browsser_and_maximize_the_window() {
		launchBrowser();
		   WindowMaximize();
	}
	@When("To launch url of facebook application")
	public void to_launch_url_of_facebook_application() {
	    launchUrl("https://en-gb.facebook.com/");
	    }
	@When("To click create new Account button")
	public void to_click_create_new_Account_button() {
		 WebElement btn = driver.findElement(By.xpath("//a[text()='Create new account']"));
		    btn.click();
	}
	@When("To pass the firstname in firstname text box")
	public void to_pass_the_firstname_in_firstname_text_box(DataTable d) throws InterruptedException {
		Thread.sleep(3000);
		Map<String, String> m = d.asMap(String.class, String.class);
		WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		firstname.sendKeys(m.get("firstname3"));
	}
	@When("To pass the surname in surname text box")
	public void to_pass_the_surname_in_surname_text_box() {
		WebElement sn= driver.findElement(By.name("lastname"));
		sn.sendKeys("deven");
	}
	@When("To pass the mobno or email in email text box")
	public void to_pass_the_mobno_or_email_in_email_text_box(DataTable d) {
		List<Map<String, String>> m = d.asMaps();
		WebElement email= driver.findElement(By.name("reg_email__"));
		email.sendKeys(m.get(1).get("password2"));
	}
	@When("To create new password using new password text box")
	public void to_create_new_password_using_new_password_text_box() {
		WebElement password= driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("2532565532");
	}
	@Then("To close the browser")
	public void to_close_the_browser() {
	   closeEntireBrowser();
	}
}
