package org.sui;

import org.testng.annotations.Test;

public class B {
	
@Test(dataProvider = "Amazon Data", dataProviderClass = Datadriventestng.class)
private void tc1(String data) {
	System.out.println(data);
}
@Test
private void tc11() {
	System.out.println("Test case 11");
}
@Test
private void tc111() {
	System.out.println("Test case 111");
}
}
