package com.oracle.test;

import java.util.Date;

public class SimpleDateFormat {

	public static void main(String[] args) {

		Date date = new Date();
		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("dd/MM/yyyy");
		String strDate = formatter.format(date);
		System.out.println(strDate);

	}

}
