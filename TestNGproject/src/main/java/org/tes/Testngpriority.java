package org.tes;

import org.testng.annotations.Test;

public class Testngpriority {
	@Test(priority = 7)
	private void tc7() {
		System.out.println("Test case 7");
	}

	@Test
	private void tc2() {
		System.out.println("Test case 2");
	}

	@Test(priority = -15)
	private void tc4() {
		System.out.println("Test case 4");
	}

	@Test(priority = -2)
	private void tc1() {
		System.out.println("Test case 1");
	}

	@Test(priority = 24)
	private void tc3() {
		System.out.println("Test case 3");
	}

	@Test(priority = -2)
	private void tc5() {
		System.out.println("Test case 5");
	}

	@Test(priority = 4)
	private void tc6() {
		System.out.println("Test case 6");
	}

}
