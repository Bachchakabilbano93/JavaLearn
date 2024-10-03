package com.oracle.test;

public class StaticMethodUse {

	public static void main(String[] args) {
		StaticCollege.change();

		StaticCollege s1 = new StaticCollege(111, "Paul");
		StaticCollege s2 = new StaticCollege(222, "Bob");
		s1.display();
		StaticCollege.college = "VJTI";
		s2.display();
		s1.display();

	}

}
