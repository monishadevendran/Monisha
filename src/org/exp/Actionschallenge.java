package org.exp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionschallenge {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhavi\\eclipse-workspace\\Worked\\drivers\\chromedriver.exe");
	// challenge 1
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
	
	// challenge 2
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	Actions b = new Actions(driver);
	WebElement prim =driver.findElement(By.id("nav-link-amazonprime"));
	b.moveToElement(prim).perform();
	
	Thread.sleep(3000);
	WebElement fastdev = driver.findElement(By.id("multiasins-img-link"));
   fastdev.click();
   
   //challenge 3
   
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhavi\\eclipse-workspace\\Worked\\drivers\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	Actions c = new Actions(driver);
	WebElement home =driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
	c.moveToElement(home).perform();

	WebElement bathlinen = driver.findElement(By.xpath("//a[text()='Bath linen']"));
  bathlinen.click();
  
 WebElement towel= driver.findElement(By.xpath("//a[@class='s1Q9rs']"));
 towel.click();
 
 //challenge 4 
 
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhavi\\eclipse-workspace\\Worked\\drivers\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.shopclues.com/wholesale.html");
	driver.manage().window().maximize();
	
	Actions d = new Actions(driver);
	WebElement mobile=driver.findElement(By.xpath("//a[text()='Mobiles & More']"));
 d.moveToElement(mobile).perform();
  
 WebElement apple =driver.findElement(By.xpath("//a[text()='Apple']"));
 apple.click();
 
 //challenge 5 
 
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhavi\\eclipse-workspace\\Worked\\drivers\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.shopclues.com/wholesale.html");
	driver.manage().window().maximize();
	
	Actions e= new Actions(driver);
	WebElement sports=driver.findElement(By.xpath("//a[text()='Sports & More']"));
 e.moveToElement(sports).perform();
  
 WebElement weightgainer =driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
 weightgainer.click();
 
 //challenge 6
 

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
	
	WebElement smaster=driver.findElement(By.xpath("//a[text()='ST Master Class']"));
	smaster.click();
	
	//challenge 8 (portable air conditioner)
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Bhavi\\eclipse-workspace\\Worked\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(" https://www.homedepot.com");
	driver.manage().window().maximize();

	Actions f = new Actions(driver);
	WebElement all = driver.findElement(By.xpath("//p[text()='Shop All']"));
	all.click();
	Thread.sleep(3000);
	WebElement shop = driver.findElement(By.id("menu-item-id-1BDh5E1pOmmWNMc7CHdLxj"));
	shop.click();

	WebElement heat = driver.findElement(By.id("menu-item-id-5mTrtGpYeRGQNyXudbwaVY"));
	heat.click();

	WebElement conditioner = driver.findElement(By.id("menu-item-id-4Mi4dy3NpcB2Coydxg4IVk"));
	conditioner.click();

	WebElement portable = driver.findElement(By.id("menu-item-id-25XQabfKV9xsqFW9070tNi"));
	portable.click();

	//challenge 9
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Bhavi\\eclipse-workspace\\Worked\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(" https://www.homedepot.com");
	driver.manage().window().maximize();

	Actions f = new Actions(driver);
	WebElement all = driver.findElement(By.xpath("//p[text()='Shop All']"));
	all.click();
	Thread.sleep(3000);
	WebElement shop = driver.findElement(By.id("menu-item-id-1BDh5E1pOmmWNMc7CHdLxj"));
	shop.click();

	WebElement paint = driver.findElement(By.id("menu-item-id-67ZimwQYnTW1rmUeYp5OzU"));
	paint.click();

	WebElement interior = driver.findElement(By.id("menu-item-id-514dpJFkktPdH3srIoSANW"));
	interior.click();

	WebElement ceiling = driver.findElement(By.id("menu-item-id-6aycmcIm7V636JGgXbucIK"));
	ceiling.click();
	
	//challenge 10
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Bhavi\\eclipse-workspace\\Worked\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();

	Actions h = new Actions(driver);
	WebElement mobile = driver.findElement(By.xpath("(//li[@class='navlink lnHeight'])[2]"));
	h.moveToElement(mobile).perform();
}

// challenge 12

System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Bhavi\\eclipse-workspace\\Worked\\drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();

Thread.sleep(3000);
Actions j = new Actions(driver);
WebElement login = driver.findElement(By.xpath("//div[@class='nav-line-1-container']"));
login.click();

WebElement mail = driver.findElement(By.id("ap_email"));
mail.sendKeys("monishasweety2206@gmail.com");

WebElement enter = driver.findElement(By.id("continue"));
enter.click();
 
 
 //challenge 13

System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Bhavi\\eclipse-workspace\\Worked\\drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();

Thread.sleep(3000);

Actions j = new Actions(driver);
WebElement login = driver.findElement(By.xpath("//div[@class='nav-line-1-container']"));
j.moveToElement(login).perform();

WebElement enter = driver.findElement(By.xpath("//a[text()='Your Seller Account']"));
enter.click();

//challenge 14

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
 
 
 
//challenge 11 ( dubai address)
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhavi\\eclipse-workspace\\Worked\\drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://inmakesedu.com/");
driver.manage().window().maximize();
Actions a = new Actions(driver);
WebElement location =driver.findElement(By.xpath("//a[@text()='Dubai:']"));
a.moveToElement(location).perform();
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}
}
