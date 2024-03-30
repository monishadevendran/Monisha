package org.par;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Crossbrowserchallenge {
	@Parameters("browser")
	@Test
private void tc1(String browsername) {
		
		WebDriver driver;
		if (browsername.equals("Chromebrowser")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
	
		else if (browsername.equals("firefoxbrowser")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();	
		}
		
		else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();	
		}
driver.get("https://www.amazon.com/");
driver.manage().window().maximize();

WebElement signin = driver.findElement(By.xpath("//div[@class='nav-line-1-container']"));
signin.click();

WebElement email = driver.findElement(By.id("ap_email"));
email.sendKeys("monishasweety2206@gmail.com");

WebElement button = driver.findElement(By.id("continue"));
button.click();
}
}
