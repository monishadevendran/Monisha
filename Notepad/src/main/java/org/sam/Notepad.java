package org.sam;

import org.pojo.Fbregpojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Notepad extends Baseclass  {
	 Fbregpojo s;
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
		    s = new Fbregpojo();
		    clickBtn(s.getCreateNewAcc());
		}

		@When("To pass the firstname in firstname text box")
		public void to_pass_the_firstname_in_firstname_text_box() {
			 s = new Fbregpojo();
			passText("moni", s.getFirstname());
		}

		@When("To pass the secondname in secondname text box")
		public void to_pass_the_secondname_in_secondname_text_box() {
			 s = new Fbregpojo();
			 passText("Devendran", s.getSecondname());
		}

		@When("To pass the mobno or email in email text box")
		public void to_pass_the_mobno_or_email_in_email_text_box() {
		    s = new Fbregpojo();
		    passText("monishaswety2206@gmail.com", s.getMobilenum());
		}

		@When("To create new password using new password text box")
		public void to_create_new_password_using_new_password_text_box() {
			 s = new Fbregpojo();
			 passText("bhavin1506",s.getPasswd());
		}

		@Then("To close the browser")
		public void to_close_the_browser() {
		    closeEntireBrowser();
		}
		
}
