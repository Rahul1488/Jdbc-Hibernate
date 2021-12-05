package com.te.arrayassignment;


public class FibaccciArray {

	public static boolean isPerfectSquare(int num) {
		int n = (int) (Math.sqrt(num));
		return (n * n == num);
	}

	public static void checkFib(int[] arr, int n) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (isPerfectSquare(5 * arr[i] * arr[i] + 4) || isPerfectSquare(5 * arr[i] * arr[i] - 4)) {
				System.out.println(arr[i] + " ");
				count++;
			}
		}
		if (count == 0) {
			System.out.println("None Present...");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 2, 8, 5, 20, 1, 40, 13, 23 };
		int n = arr.length;
		checkFib(arr, n);
	}

}