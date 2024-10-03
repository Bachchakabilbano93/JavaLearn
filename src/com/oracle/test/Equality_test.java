package com.oracle.test;

public class Equality_test {

	public static void main(String[] args) {
		
		String s1 = new String("hello");
		String s2 = new String("hello");
		
		if (s1.equals(s2)) {
			
			System.out.println("s1 equals s2");
			
		} 
		
		else {
			
			System.out.println("s1 does not equal s2");

		}
		
		if (s1==s2) {
			
			System.out.println("s1 equals s2");
			
		} 
		
		else {
			
			System.out.println("s1 does not equal s2");

		}

	}

}
