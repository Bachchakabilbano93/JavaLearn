package com.oracle.test;

public class IndexOutOfBounds {

	public static void main(String[] args) {

		try {
			int a[] = new int[10];
			a[15] = 9;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds");
		}

	}


}
