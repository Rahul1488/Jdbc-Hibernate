package com.te.challeges;

public class Challenge6 {

	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 3 == 0 && i % 5 == 0 && count <= 5) {
				sum = sum + i;
				System.out.println(i);
				count++;
			}

		}
		System.out.println("Total sum: " + sum);

	}

}
