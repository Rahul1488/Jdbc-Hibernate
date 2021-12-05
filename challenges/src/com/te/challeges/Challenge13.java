package com.te.challeges;

import java.util.Scanner;

public class Challenge13 {
	static int temp;
	static String series[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

	public static void toWords(int n) {

		if (n < 9 && n > 0) {
			for (int i = 0; i < series.length; i++) {
				if (i == n && n > 0)
					System.out.println(series[i]);
			}
		} else
			System.out.println("Number is negative");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number less than 9");
		int n = sc.nextInt();
		toWords(n);

	}

}