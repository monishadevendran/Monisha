package org.sui;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class Datadriventestng extends BaseClass {
	

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
	
	@DataProvider(name="Sample Data")
	private Object[][] data() {
		return new Object[][] {
			{"abc@gmail.com","2443473437"},
			{"seleniuminmakes@gmail.com","selenium3232"},
			{"monishasweeety2206@gmail.com","123445111"},
			{"monishabhabin@gmail.com","bhavin323r1"},
		};
	}

		@Test(dataProvider="Sample Data")
		private void tc1(String e,String pass) {
			
			driver.get("https://en-gb.facebook.com/");
			
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(e);
			
			WebElement password = driver.findElement(By.name("pass"));		
		    password.sendKeys(pass);	
		}

		@DataProvider(name="Amazon Data")
		public Object[][] datas() {
			return new Object[][] {
				{"football"},
				{"sanitizer"},
				{"xbox"},
				{"play station"},
				{"shoes"}
			};
		}
		
		@Test(dataProvider = "Amazon Data")
		private void tc2(String product) throws AWTException {
			launchUrl("https://www.amazon.in/");
			WindowMaximize();
			WebElement srcbox = driver.findElement(By.id("twotabsearchtextbox"));
			srcbox.sendKeys(product);
			
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}

		@Test
		private void tc3() {
			launchUrl("https://www.gmail.com/");
		}
//		
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

