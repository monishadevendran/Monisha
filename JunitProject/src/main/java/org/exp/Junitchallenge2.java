package org.exp;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junitchallenge2 extends BaseClass {
	@Test  //assertmethod
	public void tc1() {
		System.out.println("Test case 1");
		launchUrl("https://www.gmail.com/");
		String Title = pageTitle();
		String Url = pageUrl();
		Junitchallengegmailloginpojo f = new Junitchallengegmailloginpojo();
		passText("monisha", f.getEmail());
		Assert.assertEquals("check your url", Url, Url.contains("gmail"));
		clickBtn(f.getClickbtn());
	}
	@Before
	public void Startdate() {
		Date d = new Date();
		System.out.println(d);
	}
	@After
	public void Enddate() {
		Date d = new Date();
		System.out.println(d);
	}
	@BeforeClass
	public static void Launchthebrowser() {
		launchBrowser();
		WindowMaximize();
	}
	@AfterClass
	public static void closethebrowser() {
		closeEntireBrowser();
	}
	@Test
	public void tc3() {
		System.out.println("Test case 3");
		launchUrl("https://www.inmakes.com/");
	}
	@Test
	public void tc4() {
		System.out.println("Test case 4");
		launchUrl("https://www.youtube.com/");
	}	
}
