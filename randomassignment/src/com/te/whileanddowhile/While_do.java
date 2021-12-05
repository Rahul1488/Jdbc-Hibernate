package com.te.whileanddowhile;


import java.util.Scanner;

class While_assignment{
public static void main (String args[]){
int i;
Scanner scan=new Scanner(System.in);


System.out.print("Print all even number until:\n");


int num=scan.nextInt();
System.out.print("even number from i to "+num+" are: \n");

i=1;
do{               
    if(i%2==0){
System.out.print(i+"\n");
}
i++;
}
while(i<=num);
 
}
}
