package org.pojo;

public class Fbloginpojosample extends BaseClass {
	public static void main(String[] args) {
		launchBrowser();
		launchUrl("https://en-gb.facebook.com/");
		WindowMaximize();

		// already extends use panadhunala Fbloginpojo class la (child class) object create pani run panrom 
		Fbloginpojo f = new Fbloginpojo();
		passText("selenium", f.getEmail());
		passText("Inmakes", f.getPassword());

		driver.navigate().refresh();

		passText("bhavin", f.getEmail());
		passText("bhavin1506l", f.getPassword());
	}
}
