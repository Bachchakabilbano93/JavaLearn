package com.oracle.test;

public class ClassCastException {

	public static void main(String[] args) throws Exception {

		try {
			Object i = Integer.valueOf(42);

			String s = (String) i;
		} catch (Exception e) {

			System.out.println(e);

		}

	}

}
