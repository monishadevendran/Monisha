package org.exp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Email {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhavi\\eclipse-workspace\\Worked\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://mail.google.com/");
	driver.manage().window().maximize();
	
	 String title =driver.getTitle();
	 System.out.println(title);
	 
	 String url = driver.getCurrentUrl();
	 System.out.println(url);
	 
	 driver.close();
	 driver.quit();
}
}
