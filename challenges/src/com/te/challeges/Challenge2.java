package com.te.challeges;

import java.util.Scanner;

public class Challenge2 {
	static int area;

	public double area(double radius) {
		if (radius < 1)
			return -1.0;
		else
			return 3.142 * radius * radius;
	}

	public double area(double length, double width) {
		if ((length < 1) || (width < 1))
			return -1.0;
		else
			return length * width;
	}

	public static void main(String[] args) {
		String s;
		double radius;
		double length;
		double width;
		Scanner sc = new Scanner(System.in);
		Challenge2 a = new Challenge2();
		System.out.println("Enter the shape for which you want the area");
		s = sc.next();
		switch (s) {
		case "circle": {
			System.out.println("Enter the radius");
			radius = sc.nextDouble();
			System.out.println("Area: " + a.area(radius));
			break;
		}
		case "rectangle": {
			System.out.println("Enter length and width");
			length = sc.nextDouble();
			width = sc.nextDouble();
			System.out.println("Area: " + a.area(length, width));
			break;
		}
		default:
			System.out.println("Invalid shape");
		}

	}
}
