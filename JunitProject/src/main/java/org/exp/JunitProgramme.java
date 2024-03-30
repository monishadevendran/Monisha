package org.exp;

import org.junit.After;
import org.junit.AfterClass;
//import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitProgramme extends BaseClass {
	  @Test
		public void tc1() {
			System.out.println("Test case 1");
			launchUrl("https://en-gb.facebook.com/");
		}
	  
	   @Ignore
		@Test
		public void tc2() {
			System.out.println("Test case 2");
			launchUrl("https://www.myntra.com/");
		}
	   
		@Before
		public  void StartDate() {
			launchBrowser();
		}
	
		@After
		public void EndDate() {
			closeEntireBrowser();
		}
		
		@Test
		public void tc3() {
			System.out.println("Test case 3");
			launchUrl("https://www.snapdeal.com/");
		}
		
		@BeforeClass
		public static void LaunchTheBrowser() {
			launchBrowser();
			WindowMaximize();
		}
		
		@AfterClass
		public static void ClosetheBrowser() {
			System.out.println("close the broswser");
		}
		
		@Test
		public void tc4() {
			System.out.println("Test case 4");
			launchUrl("https://www.amazon.com/");
		}
		
		@Test
		public void tc5() {
			System.out.println("Test case 5");
			launchUrl("https://www.flipkart.com/");
		}
}
