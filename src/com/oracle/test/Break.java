package com.oracle.test;

public class Break {

	public static void main(String[] args) {

		int [] numbers = {5, 10, 15, 20, 15};

		for (int x : numbers) {

			if(x==20) {
				break;
			}

			System.out.println(x);
//			System.out.println("\n");

		}

	}

}
