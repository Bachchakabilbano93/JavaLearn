package com.oracle.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {

		// Check if a file path is provided as an argument
		if (args.length == 0) {
			System.out.println("Usage: java ReadFile <file path>");
			return; // Exit the program if no argument is provided
		}

		File file = new File(args[0]);

		try {
			//			Create a buffered reader to read each line from a file
			BufferedReader in = new BufferedReader(new FileReader(file));
			String s;

			try {
				s = in.readLine();
				while (s != null) {
					System.out.println("Read: " + s);
				}
			} finally {
				//			Close the buffered reader
				in.close();
			}
		}
		catch (FileNotFoundException e1) {
			System.out.println("File not found: " + file);
		}
		catch (IOException e2) {
			e2.printStackTrace();
		}

	}

}
