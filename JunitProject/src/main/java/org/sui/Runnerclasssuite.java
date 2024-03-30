package org.sui;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

public class Runnerclasssuite {
	
	// Way 1 
	
	@RunWith(Suite.class)
	@SuiteClasses({B.class, junitchallenge.class, A.class})
	public class Suiterunnerclass {

	}
	//Way 2

			@Test
			private void tc() {
				Result rc = JUnitCore.runClasses(B.class, junitchallenge.class, A.class);
				
				System.out.println("Total test case run count:" + rc.getRunCount());
				System.out.println("Total test case run time:" + rc.getRunTime());
				System.out.println("Total test case failure count:" + rc.getFailureCount());
				System.out.println("Total test count:" + rc.getIgnoreCount());
				
				List<Failure> f = rc.getFailures();
				for (Failure fails : f) {
					System.out.println(fails);
					
				}
			
		
	


