package com.oracle.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class InputStream {

	public static void main(String[] args) throws Exception {

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
		Student s = (Student)in.readObject();
		System.out.println(s.id + " " + s.name);

		in.close();

	}

}
