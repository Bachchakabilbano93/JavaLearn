package com.oracle.test;

import java.util.ArrayList;
import java.util.List;

public class ExtraArrayListExample {

	public static void main(String[] args) {

		List<String> obj = new ArrayList<String>();

		obj.add("Abir");
		obj.add("Navneet");
		obj.add("Himalay");
		obj.add("Rahul");
		obj.add("Shashank");

		System.out.println("Currently the array list has the following elemets:" + obj);

		//		Adding element at the given index

		obj.add(0, "Krita");
		obj.add(1, "Kaustav");

		System.out.println(obj);

	}

}
