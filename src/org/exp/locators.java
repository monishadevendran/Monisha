package org.exp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bhavi\\eclipse-workspace\\seleniumlocator\\driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();
	 
	 // to find fb webelement
	WebElement email= driver.findElement(By.id("email"));
	email.sendKeys("monishasweety2206@gmail.com");
	
	//to find password webelement
	WebElement password= driver.findElement(By.name("pass"));
	password.sendKeys("1233533");
	
	//to find login webelement
	WebElement login = driver.findElement(By.name("login"));
	login.click();

	}
}

