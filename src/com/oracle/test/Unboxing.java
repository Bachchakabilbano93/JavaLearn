package com.oracle.test;

public class Unboxing {

	public static void main(String[] args) {
		
		Integer a = new Integer(3);
		int i = a.intValue(); //Converting Integer to int
		int j = a; //Unboxing, now compiler will write a.intValue() internally
		
		System.out.println(a+" "+i+" "+j);

	}

}
  