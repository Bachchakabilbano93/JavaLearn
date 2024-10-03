package com.oracle.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {

	public static void main(String[] args) {

		LocalDate localDate1 = LocalDate.of(2020, 03, 8);
		LocalDate localDate2 = LocalDate.of(2024, 03, 13);

		Period period = Period.between(localDate1, localDate2);

		System.out.println("08-March-2020 to 13-March-2024 :Years(" + period.getYears() + "), Months(" + period.getMonths() + "), Days(" + period.getDays() + ")");



	}

}
