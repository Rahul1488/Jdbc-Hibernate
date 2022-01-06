package com.te.arraylistassignment;

import java.util.Scanner;

public class First2Elements {
	public static void main(String[] args) {
		System.out.println("Enter array length");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int myarray[] = new int[size];
		System.out.println("Enter array elements");
		for (int i = 0; i < size; i++)
			myarray[i] = sc.nextInt();
		int arr[] = array(myarray);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static int[] array(int[] myarray) {
		int[] array = new int[2];
		if (myarray.length <= 2)
			return myarray;
		else {
			for (int i = 0; i < 2; i++)
				array[i] = myarray[i];
			return array;
		}
	}
}