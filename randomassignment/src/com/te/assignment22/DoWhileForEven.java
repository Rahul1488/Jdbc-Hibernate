package com.te.assignment22;

import java.util.Scanner;

public class DoWhileForEven {
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("enter the maxium value");
		int num=ob.nextInt();
		int i=1;
		System.out.println("the even number is as follows");
		do{             
		    if(i%2==0){
		System.out.print(i+"\n");
		}
		i++;
		}
		while(i<=num);
	}

}
