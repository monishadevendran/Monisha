package org.exp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSample {
public static void main(String[] args) throws InterruptedException {
	//Action moveToElement
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhavi\\eclipse-workspace\\Worked\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://lh.inmakesedu.com/home");
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	Actions a = new Actions(driver);
	WebElement course = driver.findElement(By.id("navbarDropdown"));
	a.moveToElement(course).perform();
	
	WebElement st =driver.findElement(By.xpath("(//div[@class='dropdown dropright p-0 m-0'])[10]"));
	a.moveToElement(st).perform();
	Thread.sleep(3000);
	WebElement smaster=driver.findElement(By.xpath("//a[text()='ST Master Class']"));
	smaster.click();
	
	
	
}
}

