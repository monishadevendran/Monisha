package org.par;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Crossbrowser {
   @Parameters("browser")
	@Test
	private void tc1(String browsername) {
		
	  WebDriver driver;     //global variable 
	   if (browsername.equals("Chromebrowser")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	   else if (browsername.equals("Firefoxbrowser")) {
		WebDriverManager.chromedriver().setup();
		driver= new FirefoxDriver();
	}
	   else {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	   
	   driver.get("https://www.youtube.com/");
	   driver.manage().window().maximize();
	}
   
   
   
}
