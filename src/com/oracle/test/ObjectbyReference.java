package com.oracle.test;

public class ObjectbyReference {

	public static void main(String[] args) {

		ObjectbyReference p = new ObjectbyReference();
		p.amethod();

	}

	public void amethod() {
		ObjectClass o = new ObjectClass();
		o.i = 10;
		System.out.println("Before another = " + o.i);
		another(o);
		System.out.println("After another = " + o.i);
	}

	public void another(ObjectClass o) {
		o.i = 20;
		System.out.println("In another = " + o.i);
	}

}
