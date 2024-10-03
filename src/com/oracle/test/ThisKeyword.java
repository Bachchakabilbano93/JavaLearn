package com.oracle.test;

class ThisKeyword {

	void m() {
		System.out.println(this);
	}

	public static void main(String[] args) {

		ThisKeyword obj = new ThisKeyword();
		System.out.println(obj);
		obj.m();

	}

}
