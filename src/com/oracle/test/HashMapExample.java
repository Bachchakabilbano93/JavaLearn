package com.oracle.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {

		Map<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(1, "Abir");
		hmap.put(2, "Navneet");
		hmap.put(3, "Rahul");
		hmap.put(9, "Himalay");
		hmap.put(14, "Shashank");

		//		Display content using Iterator

		Iterator<Map.Entry<Integer, String>> it = hmap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, String> e = it.next();
			System.out.println("Key is: " + e.getKey() + " & Value is: ");
			System.out.println(e.getValue());

		}

		//		Get Value based on key

		String var = hmap.get(2);
		System.out.println("Value at index 2 is: " + var);

	}

}


