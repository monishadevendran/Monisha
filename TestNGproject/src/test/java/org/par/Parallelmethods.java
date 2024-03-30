package org.par;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallelmethods {
@Test
private void tc1() {
	System.out.println("Tc 1:"+ Thread.currentThread().getId());
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("monishasweety2206@gmail.com");
	
	WebElement password = driver.findElement(By.name("pass"));
	password.sendKeys("12467556");
}

@Test
private void tc2() {
	System.out.println("TC 2:"+ Thread.currentThread().getId());
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
}

@Test
private void tc3() {
	System.out.println("TC 3:"+ Thread.currentThread().getId());
	WebDriverManager.edgedriver().setup();
	WebDriver driver= new EdgeDriver();
	driver.get("https://www.gmail.com/");
	driver.manage().window().maximize();
}
}
