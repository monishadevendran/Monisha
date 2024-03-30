package org.tes;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Prioritychallenge extends BaseClass{
	@Test(priority = 7)
	private void tc7() {
		launchUrl("https://www.gmail.com/");
	}

	@Test
	private void tc2() {
		launchUrl("https://inmakeslh.in/login.php");
	}

	@Test(priority = -15)
	private void tc4() {
		launchUrl("https://www.amazon.in/");
	}

	@Test(priority = -2)
	private void tc1() {
		launchUrl("https://en-gb.facebook.com/");
	}

	@Test(priority = 24)
	private void tc3() {
		launchUrl("https://www.redbus.in/");
	}

	@Test(priority = -2)
	private void tc5() {
		launchUrl("https://www.youtube.com/");
	}

	@Test(priority = 4)
	private void tc6() {
		launchUrl("https://www.flipkart.com/");
	}
@BeforeClass
private void Launchthebrowser() {
	launchBrowser();
	WindowMaximize();
}
@AfterClass
private void closethebrowser() {
	closeEntireBrowser();
}
}

