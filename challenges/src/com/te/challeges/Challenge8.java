package com.te.challeges;

import java.util.Scanner;

public class Challenge8 {
	static String temp;
	static int sum;
	static int end;
	static int n1;
	static int n2;

	static int sumFirstAndLastDigit(int number) {
		if (number > 1) {
			temp = Integer.toString(number);
			end = temp.length() - 1;
			if (temp.length() == 1)
				sum = number;
			else {
				char s1 = temp.charAt(0);
				char s2 = temp.charAt(temp.length() - 1);
				n1 = Character.getNumericValue(s1); // get numeric value of character if it is
				n2 = Character.getNumericValue(s2); // number instead of coverting to ascii
				sum = n1 + n2;
				System.out.println(s2);
			}
		} else
			return -1;
		return sum;
	}

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		number = sc.nextInt();
		System.out.println("Sum: " + sumFirstAndLastDigit(number));
	}

}
