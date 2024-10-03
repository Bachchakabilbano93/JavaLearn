package com.oracle.test;

public class StringBufferInsert {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Welcome");
		sb.insert(1,"Java");
		System.out.println(sb);

	}

}
