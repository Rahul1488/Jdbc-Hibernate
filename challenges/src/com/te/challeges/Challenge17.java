package com.te.challeges;

import java.util.Scanner;

public class Challenge17 {
	double height;
	double width;

	double getHeight() {
		return height;
	}

	double getWidth() {
		return width;
	}

	void setHeight(double hight) {
		this.height = hight;
	}

	void setWidht(double width) {
		this.width = width;
	}

	double getArea() {
		return height * width;
	}

	public static void main(String[] args) {
		double height;
		double width;
		Challenge17 ch = new Challenge17();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the vlaue for height and width ");
		height = scanner.nextDouble();
		width = scanner.nextDouble();
		ch.setHeight(height);
		ch.setWidht(width);
		System.out.println("Your entered height and width value are ");
		System.out.println(ch.getHeight());
		System.out.println(ch.getWidth());
		System.out.println("Area of the wall: " + ch.getArea());

	}

}
