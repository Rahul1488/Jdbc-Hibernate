package com.te.company;

public  class Hr extends Employee {
	Hr(String ename, String designation, double sal) {
		super(ename, designation, sal);
		// TODO Auto-generated constructor stub
	}
	public void hire() {
		System.out.println("Hr does hiring ");
	}
	public void givesalary() {
		System.out.println("Hr gives salary");
	}
}
