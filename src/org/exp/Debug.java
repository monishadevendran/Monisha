package org.exp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debug {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhavi\\eclipse-workspace\\Worked\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	
	//to find create new account webelement 
	WebElement create = driver.findElement(By.xpath("//a[text()='Create new account']"));
	create.click();
	
	Thread.sleep(3000); // thread interruptedException
	// to click male radio button 
	WebElement male = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
	male.click();
}
}
