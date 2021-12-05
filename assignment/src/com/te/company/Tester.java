package com.te.company;

public abstract class Tester extends Employee{
    Tester(String ename,String designation, double sal) {
		super(ename,designation,sal);
		// TODO Auto-generated constructor stub
	}
	public abstract void test();
    public abstract void experience();
}
