package com.oracle.test;

public abstract class Shape {

	abstract void draw();

}

class Triangle extends Shape {
	void draw() {
		System.out.println("drawing traingle");
	}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("drawing rectngle");
	}
}