package com.te.company;

public class Extract{
	public void get(Developer developer) {
		System.out.println("Name: "+developer.ename);
		System.out.println("EID: "+developer.eid);
		System.out.println("Designation: "+developer.designation);
		System.out.println("Salary: "+developer.sal);
		developer.code();
		developer.experience();
		developer.project();
		
	}
	public void get(Tester tester) {
		System.out.println("Name: "+tester.ename);
		System.out.println("EID: "+tester.eid);
		System.out.println("Designation: "+tester.designation);
		System.out.println("Salary: "+tester.sal);
		tester.test();
		tester.experience();
	}
	public void get(Hr hr) {
		System.out.println("Name: "+hr.ename);
		System.out.println("EID: "+hr.eid);
		System.out.println("Designation: "+hr.designation);
		System.out.println("Salary: "+hr.sal);
		hr.hire();
		hr.givesalary();
	}
	
}
