package org.tes;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGchallenge extends BaseClass {
	
	@Test(enabled = false)
	private void tc2() {
		launchUrl("https://www.gmail.com/");
	}

	@Test
	private void tc3() {
		launchUrl("https://inmakeslh.in/login.php");
	}
	
	@Test(invocationCount = 10)
	private void tc4() {
		launchUrl("https://www.redbus.in/");
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

