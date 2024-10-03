package com.oracle.test;

public class Mult_dimensional_array {

	public static void main(String[] args) {

		int iarr[][] = new int[2][2];

		iarr[0][0] = 10;
		iarr[0][1] = 20;
		iarr[1][0] = 30;
		iarr[1][1] = 40;

		System.out.println(iarr[0][1]);
		System.out.println(iarr[1][1]);

	}

}
