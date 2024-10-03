package com.oracle.test;

public class SplitExample {

	public static void main(String[] args) {

		String s1 = "java string split method sample";
		String[] words = s1.split("\\s");//splits the string based on whitespace
		for(String w:words) {
			System.out.println(w);
		}

	}

}
