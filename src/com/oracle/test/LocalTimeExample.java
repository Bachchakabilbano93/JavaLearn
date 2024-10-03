package com.oracle.test;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeExample {

	public static void main(String[] args) {

		LocalTime currentTime = LocalTime.now();
		System.out.println("Current Time : "+currentTime);
		LocalTime localTimeZone = LocalTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println("Current Time at Zone America/Los_Angeles : "+localTimeZone);

	}

}


