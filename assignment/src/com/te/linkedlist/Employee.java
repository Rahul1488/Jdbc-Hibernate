package com.te.linkedlist;
public class Employee implements Comparable<Employee>{
	int empid;
	String name;
	double salary;

	public Employee(int empid, String name, double salary) {
		super();
		if (empid > 0) {
			this.empid = empid;
		}
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

	/*@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}*/

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.empid-o.empid;
	}
}