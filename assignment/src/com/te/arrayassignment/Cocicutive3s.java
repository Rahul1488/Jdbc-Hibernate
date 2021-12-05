package com.te.arrayassignment;

import java.util.Scanner;

public class Cocicutive3s {
	public static void main(String[] args) {
		System.out.println("Enter array length");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int myarray[] = new int[size];
		System.out.println("Enter array elements");
		for (int i = 0; i < size; i++)
			myarray[i] = sc.nextInt();
		System.out.println(myMethod(myarray));
		sc.close();
	}

	private static boolean myMethod(int[] a) {
		int flag = 0;
		for (int i = 0; i < a.length - 2; i++) {
			if (a[i] == 3)
				if (a[i + 1] == a[i] && a[i + 2] == a[i]) {
					flag = 1;
					break;
				}
		}
		if (flag == 1)
			return true;
		else
			return false;
	}

}