package com.oracle.test;

public class Loop {

	public static void main(String[] args) {

		for(int i=1;i<=10;i++) {
			System.out.println("Value of i : "+i);
		}

		int j = 1;
		while(j<=10) {
			System.out.println("Value of j : "+j);
			j++;

		}

		int k = 1;
		do {
			System.out.println("Value of k : "+k);
			k++;
		} while (k<=10);

	}

}
