package com.te.assignment22;

import java.util.Scanner;

public class Do_while {
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("enter the maxium value");
		int num=ob.nextInt();
		int i=1;
		System.out.println("the odd number is as follows");
		do{             
		    if(i%2==1){
		System.out.print(i+"\n");
		}
		i++;
		}
		while(i<=num);
	}

}
