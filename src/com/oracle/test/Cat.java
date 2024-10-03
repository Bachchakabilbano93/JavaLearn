package com.oracle.test;

class Cat extends Animal{

	String color = "white";
	
	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}

}
