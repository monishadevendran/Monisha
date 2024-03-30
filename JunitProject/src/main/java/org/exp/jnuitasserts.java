package org.exp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class jnuitasserts extends BaseClass {
	  @Test  // asserttrue
			public void tc1() {
				System.out.println("Test case 1");
				launchUrl("https://en-gb.facebook.com/");
				String Title = pageTitle();
				String Url = pageUrl();
				Fbloginpojo f = new Fbloginpojo();
				passText("monishasweety2206@gmail.com", f.getEmail());
				Assert.assertTrue("change your page title", Title.contains("facebook"));
				passText("Bhavin",f.getPassword());
			}
		  
	  @Test   //assertequal
		public void tc11() {
			System.out.println("Test case 1");
			launchUrl("https://en-gb.facebook.com/");
			String Title = pageTitle();
			String Url = pageUrl();
			Fbloginpojo f = new Fbloginpojo();
			passText("monishasweety2206@gmail.com", f.getEmail());
			Assert.assertEquals("checkyour url", Url, Url.contains("facebook"));
			passText("Bhavin",f.getPassword());
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
