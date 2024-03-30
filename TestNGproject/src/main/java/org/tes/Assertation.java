package org.tes;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertation extends BaseClass {
	@BeforeMethod
	private void StartDate() {
		Date d = new Date();
		System.out.println(d);
	}

	@AfterMethod
	private void EndDate() {
		Date d = new Date();
		System.out.println(d);
	}

	@Test 
	private void tc1() {
		driver.get("https://en-gb.facebook.com/");
		String title = pageTitle();

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("monishasweety2206@gmail.com");

		//Hardassert
		Assert.assertTrue(title.contains("facebook"), "check your page title");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("12467556");
	}

	@Test
	private void tc2() {
		driver.get("https://en-gb.facebook.com/");
		String title = pageTitle();

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("monishasweety2206@gmail.com");

		//SoftAssert
		
		SoftAssert s = new SoftAssert();
		s.assertTrue(title.contains("facebook"),"check your page title");
		
	
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("12467556");
		
		s.assertAll();
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
