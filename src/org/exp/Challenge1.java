package org.exp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bhavi\\eclipse-workspace\\Worked\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		Thread.sleep(3000);

		Actions c = new Actions(driver);
		WebElement home =driver.findElement(By.xpath("//span[text()='Fashion']"));
		c.moveToElement(home).perform();

		WebElement womenswear= driver.findElement(By.xpath("//div[@class='_1ch8e_ _1mZ8pZ']"));
		c.moveToElement(womenswear).perform();

		WebElement sliper= driver.findElement(By.xpath("(//a[text()='Women Flats'])[2]"));
		sliper.click();
		
	
	}
	}

