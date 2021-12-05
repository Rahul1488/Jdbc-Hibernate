package com.te.assignment22;
import java.util.Scanner;

public class Progression_assignment {

	public static void main(String[] args) 
	{
	Scanner z=new Scanner(System.in);
	System.out.println("Enter the value of A");
	int a=z.nextInt();


	Scanner y =new Scanner(System.in);
	System.out.println("Enter the value of B");
	int b=y.nextInt();

	Scanner u=new Scanner(System.in);
	System.out.println("Enter the value of N");
	int n=u.nextInt();

	double sum;
	double reselt;
	for (int i = 1; i <=n; i++) 
	{
	  sum=a+(Math.pow(2, n)*b);
	  reselt=sum+(Math.pow(2, n)*b);
	  System.out.println("The result "+reselt);
	}


	}
	}
