package com.oracle.test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExternalIteratorDemo {

	public static void main(String[] args) {

		List<String> names = new LinkedList<>();

		names.add("Abir");
		names.add("Navs");
		names.add("John");

		Iterator<String> namesIterator = names.iterator();

		while (namesIterator.hasNext()) {
			System.out.println(namesIterator.next()); 			
		}

	}

}
