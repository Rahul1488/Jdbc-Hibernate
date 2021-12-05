package com.te.challeges;

import java.util.Scanner;
public class Challenge7 {
	static int sum=0;
	static int isOdd(int start, int end) {
		if(end >= start && start > 0 && end > 0) {
		for(int i = start; i < end; i++ ) {
			if(i % 2 == 0 )
				continue;
			else {
				sum = sum + i;
				System.out.println(" "+i);
			}
		}		
		}else {
			return -1;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		int start;
		int end;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start");
		start = sc.nextInt();
		System.out.println("enter end");
		end = sc.nextInt();
		System.out.println("sum: "+ isOdd(start, end));
	}

}
