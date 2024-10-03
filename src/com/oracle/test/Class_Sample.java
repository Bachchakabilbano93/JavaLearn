package com.oracle.test;

public class Class_Sample implements Interface_Sample{

	public void print() {
		System.out.println("Interface Example");
	}

	public static void main(String[] args) {

		Class_Sample A = new Class_Sample();
		A.print();

	}

}
