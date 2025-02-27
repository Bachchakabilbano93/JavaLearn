package com.oracle.test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Date;

public class DeSerializeDate {

	DeSerializeDate() {
		Date d = null;

		try {
			FileInputStream f = new FileInputStream("date.ser");
			ObjectInputStream s = new ObjectInputStream(f);
			d = (Date) s.readObject(); //Serialization stars here
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Deserialized Date object from date.ser");
		System.out.println("Date: " + d);
	}

	public static void main(String[] args) {

		new DeSerializeDate();

	}

}
