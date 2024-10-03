package com.oracle.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerializeDate {

	void SerializeDate() {

		Date d = new Date();

		try {
			FileOutputStream f = new FileOutputStream("date.ser");
			ObjectOutputStream s = new ObjectOutputStream(f);
			s.writeObject(d); //Serialization starts here
			s.close();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	public static void main(String[] args) {

		SerializeDate sd = new SerializeDate();
		sd.SerializeDate();

	}

}
