package com.oracle.test;

import java.util.*;

public class ArrayListExample {

	public static void Process() {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Munu");
		list.add("John");
		list.add("James");
		list.add("Leonard");

		Iterator itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());;			
		}

	}

}
