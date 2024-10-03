package com.oracle.test;

public class TestThread {

	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();

	public static void main(String[] args) {

		Thread1 T1 = new Thread1();
		Thread2 T2 = new Thread2();
		T1.start();
		T2.start();

	}

	private static class Thread1 extends Thread {
		public void run() {
			synchronized(Lock1) {
				System.out.println("Thread 1: Hold lock 1...");
				try {
					Thread.sleep(15);
				} catch (Exception e) {

				}
				System.out.println("Thread 1: Wait lock 2...");
				synchronized(Lock2) {
					System.out.println("Thread 1: Hold lock 1 & 2...");
				}
			}
		}

	}

	private static class Thread2 extends Thread {
		public void run() {
			synchronized(Lock2) {
				System.out.println("Thread 2: Hold lock 2...");
				try {
					Thread.sleep(10);
				} catch (Exception e) {

				}
				System.out.println("Thread 2: Wait lock 1...");
				synchronized(Lock2) {
					System.out.println("Thread 2: Hold lock 1 & 2...");
				}
			}
		}

	}

}