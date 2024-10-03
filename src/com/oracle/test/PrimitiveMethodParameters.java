package com.oracle.test;

public class PrimitiveMethodParameters {

	public static void main(String[] args) {

		PrimitiveMethodParameters p = new PrimitiveMethodParameters();
		p.amethod();

	}

	public void amethod() {
		int i = 10;
		System.out.println("Before another i = " + i);
		another(i);
		System.out.println("After another i = " + i);
	}

	public void another(int i) {
		i+=10;
		System.out.println("In another i = " + i);
	}

}
