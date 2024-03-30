package org.tes;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGprogramme extends BaseClass{
	@Test(invocationCount = 3)
	private void tc1() {
		launchUrl("https://en-gb.facebook.com/");
		Fbloginpojo f = new Fbloginpojo();
		passText("monishasweety2206@gmail.com", f.getEmail());
		passText("12345",f.getPassword());
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

