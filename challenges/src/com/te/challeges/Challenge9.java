package com.te.challeges;

import java.util.Scanner;

public class Challenge9 {
	static int sum = 0;

	static char temp;
	static int temp1;

	static int getEvenDigitSum(int number) {
		if (number < 1)
			return -1;
		String numString = Integer.toString(number);
		int n = numString.length();
		char arr1[] = new char[n];
		int arr2[] = new int[n];
		if (n == 1 && number % 2 == 0)
			return number;
		else {
			for (int i = 0; i < n; i++) {
				temp = numString.charAt(i);
				arr1[i] = temp;
			}
			for (int i = 0; i < n; i++) {
				temp1 = Character.getNumericValue(arr1[i]);
				arr2[i] = temp1;

			}
			for (int i = 0; i < n; i++) {
				if (arr2[i] % 2 == 0) {
					sum = sum + arr2[i];
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		number = sc.nextInt();
		System.out.println("Sum: " + getEvenDigitSum(number));
	}

}