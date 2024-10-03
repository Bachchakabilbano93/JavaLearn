package com.oracle.test;

public class Autoboxing {

	public static void main(String[] args) {

		int a = 20;
		Integer i = Integer.valueOf(a); //converting int into Integer
		Integer j = a; //Autoboxing, now compiler will write Integer.valueof(a) internally

		System.out.println(a+" "+i+" "+j);

	}

}
