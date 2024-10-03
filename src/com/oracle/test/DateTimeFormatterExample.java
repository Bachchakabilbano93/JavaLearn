package com.oracle.test;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {

	public static void main(String[] args) {

		DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss z");
		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("dd/MMM/YYYY");

		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		String formatter1 = dateTimeFormatter1.format(zonedDateTime);
		String formatter2 = dateTimeFormatter2.format(zonedDateTime);
		String formatter3 = dateTimeFormatter3.format(zonedDateTime);

		System.out.println(formatter1);
		System.out.println(formatter2);
		System.out.println(formatter3);

	}

}
