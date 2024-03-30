package org.exp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Samplejunit {
	@Test
	public void tc1() {
		System.out.println("Test case 1");
	}

	@Ignore
	@Test
	public void tc2() {
		System.out.println("Test case 2");
	}

	@Before
	public void StartDate() {
		System.out.println("Test case start Date & Time");
	}

	@After
	public void EndDate() {
		System.out.println("Test case End Date & Time");

	}

	@Test
	public void tc3() {
		System.out.println("Test case 3");
	}

	@BeforeClass
	public static void LaunchBrowser() {
		System.out.println("BrowserLaunch....");
	}

	@AfterClass
	public static void ClosetheBrowser() {
		System.out.println("close the broswser");
	}

	@Test
	public void tc4() {
		System.out.println("Test case 4");
	}

	@Test
	public void tc5() {
		System.out.println("Test case 5");
	}
}
