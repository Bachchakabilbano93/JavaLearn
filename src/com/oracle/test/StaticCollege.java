package com.oracle.test;

public class StaticCollege {

	int rollno;
	String name;
	static String college = "MGT";
	static void change() {
		college = "MGIT";
	}

	StaticCollege(int r, String n){
		rollno = r;
		name = n;
	}
	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}

}
