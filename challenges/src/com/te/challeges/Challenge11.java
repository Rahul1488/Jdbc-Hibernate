package com.te.challeges;

import java.util.Scanner;

public class Challenge11 {
	static boolean hasSameLastDigit(int a, int b, int c) {
		if (a < 1 || b < 1 || c < 1)
			return false;
		int a1 = 0;
		int b1 = 0;
		int c1 = 0;
		int a2 = 0;
		int b2 = 0;
		int c2 = 0;
		if (a > 100) {
			a1 = a / 100;
			a2 = a1 % 10;
		}
		if (a > 10) {
			a2 = a % 10;
		}
		if (b > 100) {
			b1 = a / 100;
			b2 = b1 % 10;
		}
		if (b > 10) {
			b2 = b % 10;
		}
		if (c > 100) {
			c1 = c / 100;
			c2 = c1 % 10;
		}
		if (c > 10) {
			c2 = c % 10;
		}
		System.out.println(a2 + " " + b2 + " " + c2);
		if (a2 == b2 || a2 == c2 || c2 == b2) {
			return true;
		} else
			return false;

	}

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter three number");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		System.out.println(hasSameLastDigit(a, b, c));

	}

}
