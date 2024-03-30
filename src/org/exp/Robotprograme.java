package org.exp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotprograme {
	public static void main(String[] args) throws AWTException, InterruptedException {
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
				
				// ctrl+c and ctrl+v method 
				
				Actions a = new Actions(driver);
				Robot r = new Robot();
				WebElement email = driver.findElement(By.id("email"));
				email.sendKeys("Inmakes");

				a.doubleClick(email).perform();
				
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_C);
				
				r.keyRelease(KeyEvent.VK_CONTROL);
				r.keyRelease(KeyEvent.VK_C);
				
				r.keyPress(KeyEvent.VK_TAB);
				r.keyRelease(KeyEvent.VK_TAB);
				
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_V);
				
				r.keyRelease(KeyEvent.VK_CONTROL);
				r.keyRelease(KeyEvent.VK_V);
			
				//keydown&keyup
				
				Actions a = new Actions(driver);
				Robot r = new Robot();
				WebElement email = driver.findElement(By.id("email"));
				a.keyDown(Keys.SHIFT).sendKeys(email,"Inmakes").keyUp(Keys.SHIFT).perform();
				

			}

	}
}
