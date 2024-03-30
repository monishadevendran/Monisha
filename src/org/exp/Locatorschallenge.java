package org.exp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorschallenge {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Bhavi\\eclipse-workspace\\Worked\\drivers\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("monishasweety2206@gmail.com");
	
	WebElement pass = driver.findElement(By.name("pass"));
    pass.sendKeys("7665");
    
   WebElement login = driver.findElement(By.name("login"));
   login.click();
   
   // challenge 2 (youtube india)
   
   System.setProperty("webdriver.chrome.driver","C:\\Users\\Bhavi\\eclipse-workspace\\Worked\\drivers\\chromedriver.exe");
	WebDriver driver1 =new ChromeDriver();
	driver1.get("https://www.youtube.com/results?search_query=india");
	driver1.manage().window().maximize();
	
	// challenge 3 (iphone)
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Bhavi\\eclipse-workspace\\Worked\\drivers\\chromedriver.exe");
	WebDriver driver11 =new ChromeDriver();
	driver11.get("https://www.amazon.in/Apple-iPhone-13-128GB-Starlight/dp/B09G9D8KRQ/ref=sr_1_1_sspa?keywords=iphone&qid=1706642279&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY");
	driver11.manage().window().maximize();
	
	//challemge 4 ( fb login using xpath)
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Bhavi\\eclipse-workspace\\Worked\\drivers\\chromedriver.exe");
	WebDriver driver11 =new ChromeDriver();
	driver11.get("https://www.facebook.com");
	driver11.manage().window().maximize();
	
	WebElement email=driver11.findElement(By.xpath("//input[@data-testid='royal_email']"));
	email.sendKeys("monishasweety2206@gmail.com");
	
	WebElement pass = driver11.findElement(By.xpath("//input[@data-testid='royal_pass']"));
	pass.sendKeys("37587");
	
	WebElement login = driver11.findElement(By.xpath("//button[@type='submit']"));
	login.click();
	
	
	// challenge 5 
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Bhavi\\eclipse-workspace\\Worked\\drivers\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	
   WebElement from = driver.findElement(By.id("src"));
   from.sendKeys("chennai");

   WebElement to = driver.findElement(By.id("dest"));
   to.sendKeys("coimbatore");
   
   WebElement date = driver.findElement(By.id("onwardCal"));
   date.sendKeys("5feb");
   
   WebElement button = driver.findElement(By.id("search_button"));
 button.click();
 
 //challenge 6
 
 
 System.setProperty("webdriver.chrome.driver","C:\\Users\\Bhavi\\eclipse-workspace\\Worked\\drivers\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.cleartrip.com/trains");
	driver.manage().window().maximize();
	
 WebElement from1 = driver.findElement(By.id("from_station"));
	from1.sendKeys("chennai");
	
	WebElement to1 = driver.findElement(By.name("to_station"));
 to1.sendKeys("Tirupathur");

WebElement login = driver.findElement(By.id("trainFormButton"));
login.click();

	
	//challenge 7 (flipkart redmi)
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhavi\\eclipse-workspace\\Worked\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/redmi-12-jade-black-128-gb/p/itm7b10fd42f78b2?pid=MOBGRMFKKDQ2A3V4&lid=LSTMOBGRMFKKDQ2A3V4XZOVEW&marketplace=FLIPKART&q=redmi+mobile&store=tyy%2F4io&srno=s_1_1&otracker=AS_Query_OrganicAutoSuggest_6_5_na_na_na&otracker1=AS_Query_OrganicAutoSuggest_6_5_na_na_na&fm=organic&iid=3eb8c49d-ca02-43c5-b908-1defb820ac91.MOBGRMFKKDQ2A3V4.SEARCH&ppt=hp&ppn=homepage&ssid=gk2woja3340000001706723525203&qH=32cc053b9c6a5ba2");
	driver.manage().window().maximize();
	
	// Challenge 8 (amazon hp laptop)
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhavi\\eclipse-workspace\\Worked\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/HP-i3-1215U-15-6-inch-Graphics-Speakers/dp/B0BP2M7CCS/ref=sr_1_3?crid=XD4H7B1TGMF1&keywords=hp+laptop&qid=1706723654&s=electronics&sprefix=hp%2Celectronics%2C213&sr=1-3");
	driver.manage().window().maximize();
	
	
	//challenge 9 (inmakes paragraph)
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhavi\\eclipse-workspace\\Worked\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://inmakesedu.com/");
	driver.manage().window().maximize();
	WebElement inm=driver.findElement(By.xpath("//h1[contains(text(),'Learning Today ')]"));
	String txt=inm.getText();
	System.out.println(txt);
	
	//challenge 10 (inmakes paragraph)
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhavi\\eclipse-workspace\\Worked\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://inmakesedu.com/about_us");
	driver.manage().window().maximize();
	WebElement inm=driver.findElement(By.xpath("//h2[contains(text(),'hub')]"));
	String txt=inm.getText();
	System.out.println(txt);
	
	//challenge 12 ( inmakes learning hub click )
	
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhavi\\eclipse-workspace\\Worked\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			
			WebElement inm = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		   inm.sendKeys("inmakes learning hub");
		   
		   WebElement search =driver.findElement(By.xpath("//input[@name='btnK']"));
        search.click();
		 
		  // challenge 12(login )
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhavi\\eclipse-workspace\\Worked\\drivers\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://www.flipkart.com/");
    	driver.manage().window().maximize();
    	
    	WebElement num = driver.findElement(By.xpath("//a[text()='Login']"));
       num.click();
       
      WebElement login = driver.findElement(By.xpath("//input[@type='text']"));
      login.sendKeys("7708455245");
      
      WebElement otp = driver.findElement(By.xpath("//button[text()='Request OTP']"));
      otp.click();
      

	
	
	
}
}
