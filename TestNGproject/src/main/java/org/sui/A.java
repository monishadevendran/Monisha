package org.sui;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.tes.BaseClass;
import org.tes.Fbloginpojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A extends BaseClass {
	
	//optional parameter
	@Parameters({"user","pass"})
		@Test
		private void tc1(@Optional ("abc@gmail.com")String e, @Optional("123456") String pass) {
			launchUrl("https://en-gb.facebook.com/");
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(e);
			
			WebElement password = driver.findElement(By.name("pass"));		
		    password.sendKeys(pass);	
		}

		@Test(enabled=false)
		private void tc2() {
			launchUrl("https://www.amazon.in/");
		}

		@Test
		private void tc3() {
			launchUrl("https://www.gmail.com/");
		}

		@BeforeMethod
		private void StartDate() {
		Date d =new Date();
		System.out.println(d);
		}
		
		@AfterMethod
		private void EndDate() {
			Date d = new Date();
			System.out.println(d);
		}

		@BeforeClass
		private void launchThebrowser() {
			launchBrowser();
			WindowMaximize();
				}

		@AfterClass
		private void closeThebrowser() {
			closeEntireBrowser();
		}
	}

