package com.te.company;

public class Employee {
	Employee(String ename,String designation,double sal){
		this.ename=ename;
		this.sal=sal;
		this.designation=designation;
	}
	Employee(){
		count=count-1;
		System.out.println("Total employees= "+count);
	}
	public static int count=0;
    double sal;
	String ename;
	public static String company = "Technoelevate";
	public int eid=100+count;
	public String designation;
	{
		count++;
	}
	
	
	
	
	
	
	
	
	

}