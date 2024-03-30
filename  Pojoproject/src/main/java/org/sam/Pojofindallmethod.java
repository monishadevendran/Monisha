package org.sam;

public class Pojofindallmethod  extends BaseClass{
	public static void main(String[] args) {
		launchBrowser();
		launchUrl("https://en-gb.facebook.com/");
		WindowMaximize();

		// already extends use panadhunala Fbloginpojo class la (child class) object create pani run panrom 
		Pojofindallmethodsample f = new Pojofindallmethodsample();
		passText("selenium", f.getVarRef());
		passText("Inmakes", f.getPassword());
        clickBtn(f.getLoginBtn());
	}
}
