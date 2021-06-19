package com.testrunner;

import com.google.threadclasses.GoogleFeatureThread;

public class GoogleTestRunner {

	public static void main(String[] args) {

//		Thread t1 = new GoogleFeatureThread("google thread", "chrome");
//		Thread t2 = new GoogleFeatureThread("firefox thread", "firefox");
//		
//		System.out.println("threads started...");
//		
//		t1.start();
//		t2.start();

		int chromeCount = Integer.parseInt(System.getProperty("chrome"));
		int firefoxCount = Integer.parseInt(System.getProperty("firefox"));
		
		System.out.println("total chrome count: " + chromeCount + " and " + "total firefox count: " + firefoxCount);

		for (int i = 0, j = 0; i < chromeCount || j < firefoxCount; i++, j++) {
			System.out.println("thread started...");
			new GoogleFeatureThread("google thread", "chrome").start();
			new GoogleFeatureThread("firefox thread", "firefox").start();
			System.out.println("thread ended...");
		}
	}

}
