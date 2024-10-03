package com.oracle.test;

public class CustomException {

	static void validate(int age) throws InvalidAgeException {
		if(age<18)
			throw new InvalidAgeException("not valid");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String[] args) {

		try {
			validate(13);
		} catch (InvalidAgeException m) {
			System.out.println("Exception occured: " + m);
		}
		System.out.println("Code is executing");
	}

}
