package com.oracle.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class LocalDateTimeExample {

	public static void main(String[] args) {

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Current Date Time : " + localDateTime);
		LocalDateTime localDateTimeZone = LocalDateTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println("Current Date Time at America/Los_Angeles : "+localDateTimeZone);

	}

}
