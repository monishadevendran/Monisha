package org.exp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumxpath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhavi\\eclipse-workspace\\Worked\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement mail = driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
	mail.sendKeys("monishasweety2206@gmail.com");
	
	WebElement pass = driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
	pass.sendKeys("1234566gfhh");
	
	WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	login.click();
	}
}
