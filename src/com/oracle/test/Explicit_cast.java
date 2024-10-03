package com.oracle.test;

public class Explicit_cast {

	public static void main(String[] args) {

		double d = 100.04;
		long l = (long) d;
		int i = (int) l;

		System.out.println("Double value " + d);
		System.out.println("Long value " + l);
		System.out.println("Int value " + i);

	}

}
