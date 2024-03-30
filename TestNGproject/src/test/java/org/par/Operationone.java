package org.par;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Operationone {
	@Test
	private void tc1() {
		System.out.println("Tc 1:"+ Thread.currentThread().getId());
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		
		
	}

	@Test
	private void tc2() {
		System.out.println("TC 2:"+ Thread.currentThread().getId());
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
	}

	@Test
	private void tc3() {
		System.out.println("TC 3:"+ Thread.currentThread().getId());
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.biotique.com/");
		driver.manage().window().maximize();
	}
}
