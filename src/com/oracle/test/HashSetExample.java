package com.oracle.test;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		Set<String> hset = new HashSet<String>();

		hset.add("Apple");
		hset.add("Mango");
		hset.add("Grapes");
		hset.add("Orange");
		hset.add("Fig");

		//		Adding duplicate elements

		hset.add("Apple");
		hset.add("Mango");

		//		Adding null values

		hset.add(null);
		hset.add(null);

		System.out.println(hset);

	}

}
