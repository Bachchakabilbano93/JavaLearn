package com.oracle.test;

import java.util.Arrays;

public class Char_Array {

	public char[] CreateArray() {

		char[] S;

		S = new char[26];						

		for (int i = 0; i < 26; i++) {

			S[i] = (char) ('A' + i);

		}

		return S;

	}

	public static void main(String[] args) {
		Char_Array charArray = new Char_Array();  // Create an instance of Char_Array
		char[] array = charArray.CreateArray();  // Call the CreateArray method

		// Print the array
		for (char c : array) {
			System.out.print(c + " ");
		}

		// Print the array using Arrays.toString()
		System.out.println(Arrays.toString(array));
	}

}