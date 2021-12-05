package com.te.assignment1;

import java.util.Scanner;

public class SpecialChar
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String ab=sc.nextLine();
		String abc=ab.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(abc);
		
	}
}
