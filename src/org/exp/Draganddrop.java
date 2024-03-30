package org.exp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Draganddrop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhavi\\eclipse-workspace\\Worked\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	
	Actions a = new Actions(driver);
	WebElement banksrc=driver.findElement(By.xpath("//a[text()=' BANK ']"));
	
	WebElement debit = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	a.dragAndDrop(banksrc, debit).perform();
	
	WebElement sales = driver.findElement(By.xpath("//a[text()=' SALES ']"));
	WebElement credit = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
	a.dragAndDrop(sales, credit).perform();
	
	WebElement amount = driver.findElement(By.xpath("//a[text()=' 5000']"));
	WebElement debamount = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
	a.dragAndDrop(amount, debamount).perform();
	
	Thread.sleep(2000);
	WebElement salesamount= driver.findElement(By.xpath("//a[text()=' 5000 ']"));
	WebElement credamount = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	a.dragAndDrop(salesamount, credamount).perform();
	
}
}