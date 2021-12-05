package com.te.challeges;

import java.util.Scanner;

public class Challenge5 {
	static int temp;
	static String series[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

	public static void toWords(int n) {

		if (n < 9 || n > -9) {
			for (int i = 0; i < series.length; i++) {
				if (i == n && n > 0)
					System.out.println(series[i]);
				if (-i == n && n< 0)
					System.out.println("Minus " + series[i]);
			}
		} else
			System.out.println("Number is greater than 9");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number in beteween the range -9  and 9");
		int n = sc.nextInt();
		toWords(n);

	}

}