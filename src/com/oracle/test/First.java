package com.oracle.test;
import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		
		Variables obj = new Variables();
		obj.method();
		
		System.out.println(obj.data);//Instance Variable/Non-Static
		System.out.println(Variables.m);//Class Variable/Static
//		System.out.println(obj.n);
		
		User ins = new User();
		ins.setUserId(100);
		System.out.println(ins.getUserId());
		
		Scanner s = new Scanner(System.in);
		User k = new User();
		System.out.println("Enter first name of user: ");
		k.setFirstName(s.nextLine());
		System.out.println("Enter last name of user: ");
		k.setLastName(s.nextLine());
		System.out.println("Enter age of user: ");
		k.setAge(s.nextInt());
		System.out.println("Information of User: ");
		System.out.println("First Name: " + k.getFirstName() +"\t"+ " Last Name: " + k.getLastName() +"\t"+ " Age: " + k.getAge());
		
	}

}
