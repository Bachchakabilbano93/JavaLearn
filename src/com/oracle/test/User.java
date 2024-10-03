package com.oracle.test;

public class User {
	
	private int userId = 50;
	private String firstName = "John";
	private String lastName = "Doe";
	private int age = 22;
	
	public String getFirstName() {
		return firstName;
	};
	
	public void setFirstName(String first) {
		this.firstName = first;
	};
	
	public String getLastName() {
		return lastName;
	};
	
	public void setLastName(String last) {
		this.lastName = last;
	};
	
	public int getAge() {
		return age;
	};
	
	public void setAge(int year) {
		this.age = year;
	};

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}
