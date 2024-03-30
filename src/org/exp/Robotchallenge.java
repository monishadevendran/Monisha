package org.exp;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotchallenge {
	// challenge 1 
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Bhavi\\eclipse-workspace\\Worked\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();

	Actions a = new Actions(driver);
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("monishasweety2206@gmail.com");

	a.doubleClick(email).perform();
	a.contextClick(email).perform();

	Robot r = new Robot();
	for (int i = 0; i < 6; i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement password = driver.findElement(By.id("pass"));
		a.contextClick(password).perform();

		for (int j = 0; j < 4; j++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			}
		
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
	}	
	
	// challenge 2 
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Bhavi\\eclipse-workspace\\Worked\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();

	Actions a = new Actions(driver);
	
	WebElement google =driver.findElement(By.className("gLFyf"));
	google.sendKeys("InmakesInfotech");
	
	a.doubleClick(google).perform();
	
	
	// challenge 3 
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhavi\\eclipse-workspace\\Worked\\drivers\\chromedriver.exe");
 	WebDriver driver = new ChromeDriver();
 	driver.get("https://www.flipkart.com/");
 	driver.manage().window().maximize();
 	
 	WebElement num = driver.findElement(By.xpath("//a[text()='Login']"));
    num.click();
    
    WebElement login = driver.findElement(By.xpath("//input[@type='text']"));
   login.sendKeys("7708455245");
   
   Actions a = new Actions(driver);
   a.doubleClick(login).perform();
   
   Robot r = new Robot();
   
   r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		
   WebElement otp = driver.findElement(By.xpath("//button[text()='Request OTP']"));
   otp.click();

//challenge 4 

System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Bhavi\\eclipse-workspace\\Worked\\drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();


WebElement log =driver.findElement(By.id("nav-link-accountList-nav-line-1"));
log.click();

Actions a = new Actions(driver);

WebElement email = driver.findElement(By.id("ap_email"));
email.sendKeys("monishasweety2206@gmail.com");
Thread.sleep(3000);
a.doubleClick(email).perform();
a.contextClick(email).perform();

Robot r = new Robot();
for (int i = 0; i < 1; i++) {
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);

	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	// challenge 5
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Bhavi\\eclipse-workspace\\Worked\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();

	Actions a = new Actions(driver);
	WebElement women =driver.findElement(By.xpath("//li[@class='navlink lnHeight']"));
	a.moveToElement(women).perform();
	a.contextClick(women).perform();
	
	Robot r = new Robot();
	for (int i = 0; i < 2; i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//challenge 6
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bhavi\\eclipse-workspace\\Worked\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);
		WebElement grocery =driver.findElement(By.xpath("//div[@class='YBLJE4']"));
		a.moveToElement(grocery).perform();
		
		a.contextClick(grocery).perform();
		
		Robot r = new Robot();
		for (int i = 0; i < 5; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
}
}
}