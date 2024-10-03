package com.oracle.test;

public class Employee extends Person {
	
	float salary;
	Employee(String name, float salary) {
		super(name);
		this.salary = salary;
	}
	
	void display() {
		System.out.println(name + " " + salary);
	}

}
