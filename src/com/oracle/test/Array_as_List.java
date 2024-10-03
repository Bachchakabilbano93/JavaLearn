package com.oracle.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Array_as_List {

	public static void main(String[] args) {

		int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		List<Integer> list = Arrays.stream(number).boxed().collect(Collectors.toList());

		System.out.println("List : " + list);

	}

}
