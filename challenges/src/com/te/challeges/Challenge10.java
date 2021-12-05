package com.te.challeges;

import java.util.Scanner;

public class Challenge10 {
	static boolean hasSharedDigit(int num1, int num2) {
		if (num1 > 10 && num1 < 99 && num2 > 10 && num2 < 99) {
			int x = num1 / 10; // gives first digit of num1
			int y = num1 % 10;// gives second digit of num1
			int a = num2 / 10; 
			int b = num2 % 10;
			if(x == a || x == b || y == a || y == b)
				return true;
			else
				return false;
		}
		else
			return false;
	}

	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println(hasSharedDigit(num1, num2));
		

	}

}