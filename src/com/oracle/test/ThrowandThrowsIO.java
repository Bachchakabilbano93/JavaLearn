package com.oracle.test;

import java.io.IOException;

public class ThrowandThrowsIO {

	void m() throws IOException {
		throw new IOException("device error");
	}

	void n() throws IOException {
		m();
	}

	void p() {
		try {
			n();
		} catch (IOException e) {
			System.out.println("exception corrected");
		}
	}

	public static void main(String[] args) {

		ThrowandThrowsIO obj = new ThrowandThrowsIO();
		obj.p();
		System.out.println("Program works fine...");

	}

}
