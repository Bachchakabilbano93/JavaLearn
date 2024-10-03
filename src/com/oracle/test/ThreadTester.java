package com.oracle.test;

public class ThreadTester {

	public static void main(String[] args) {

		HelloRunner r = new HelloRunner();
		Thread t = new Thread(r);
		t.start();

	}

}
