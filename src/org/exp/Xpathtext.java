package org.exp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathtext {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhavi\\eclipse-workspace\\Worked\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	
	//to find facebook text by using contains text xpath
	WebElement fbTxt = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps ')]"));
	String txt =fbTxt.getText();	
	System.out.println(txt);
	
	//to find new account button webelement 
	WebElement newbtn = driver.findElement(By.xpath("//a[text()='Create new account']"));
	newbtn.click();
}
}
