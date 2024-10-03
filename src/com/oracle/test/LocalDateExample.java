package com.oracle.test;

import java.time.LocalDate;
import java.time.ZoneId;

public class LocalDateExample {

	public static void main(String[] args) {

		LocalDate localDateToday = LocalDate.now();
		System.out.println("Today's Date : "+localDateToday);
		LocalDate localDateZone = LocalDate.now(ZoneId.of("America/Los_Angeles"));
		System.out.println("Today's Date at Zone America/Los_Angeles : "+localDateZone);

	}

}
