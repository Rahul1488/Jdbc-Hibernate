package com.te.challeges;

import java.util.Scanner;

public class Challenge12 {
	public static void GetFactors(int number) {
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		System.out.println("Factors of " + number + " are ");
		GetFactors(number);
	}
}