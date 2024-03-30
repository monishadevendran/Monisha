package org.sui;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sampleproject {

	@Test
	private void tc1() {
		System.out.println("Test case 1");
	}

	@Test
	private void tc2() {
		System.out.println("Test case 2");
	}

	@Test
	private void tc3() {
		System.out.println("Test case 3");
	}

	@BeforeMethod
	private void StartDate() {
		System.out.println("Test case Starting Date and Time");
	}

	@AfterMethod
	private void Enddate() {
		System.out.println("Test case End date and Time");
	}

	@BeforeClass
	private void launchThebrowser() {
		System.out.println("Launch browser");
	}

	@AfterClass
	private void closeThebrowser() {
		System.out.println("Close browser");
	}
}
