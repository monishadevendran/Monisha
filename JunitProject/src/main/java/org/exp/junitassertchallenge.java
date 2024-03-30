package org.exp;

import org.junit.Assert;
import org.junit.Test;

public class junitassertchallenge extends BaseClass{
	 @Test  // asserttrue
		public void tc1() {
			System.out.println("Test case 1");
			launchUrl("https://en-gb.facebook.com/");
			String Title = pageTitle();
			String Url = pageUrl();
			Fbloginpojo f = new Fbloginpojo();
			passText("monishasweety2206@gmail.com", f.getEmail());
			Assert.assertTrue("change your page title", Title.contains("facebook"));
			passText("Bhavin",f.getPassword());
}
}