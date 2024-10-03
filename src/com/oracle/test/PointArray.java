package com.oracle.test;

import java.awt.Point;
import java.util.Arrays;

public class PointArray {

	public Point[] CreateArray() {

		Point[] p;

		p = new Point[10];

		for (int i = 0; i < 10; i++) {

			p[i] = new Point(i, i+1);

		}

		return p;

	}

	public static void main(String args[]) {

		PointArray coordinateArray = new PointArray();
		Point[] c = coordinateArray.CreateArray();

		for (Point d : c) {
			System.out.println(d + " ");
		}

		System.out.println(Arrays.toString(c));

	}

}
