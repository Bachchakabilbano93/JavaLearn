package com.oracle.test;

public class MatchesExample {

	public static void main(String[] args) {

		String str = new String("Java String Methods");

		System.out.println("Regex: (.*)String(.*) matches string? ");
		System.out.println(str.matches("(.*)String(.*)"));

		System.out.println("Regex: (.*)Strings(.*) matches string? ");
		System.out.println(str.matches("(.*)Strings(.*)"));

		System.out.println("Regex: (.*)Methods matches string? ");
		System.out.println(str.matches("(.*)Methods"));

	}

}
