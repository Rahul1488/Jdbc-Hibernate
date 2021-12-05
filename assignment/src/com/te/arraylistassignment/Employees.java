package com.te.arraylistassignment;

public class Employees {
	private int eid;
	private String ename;
	private double esalary;

	public Employees(int eid, String ename, double esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.check(eid);
	}

	public void check(int eid) {
		int temp = eid;
		if (temp !=eid) {
			return;
		} else {
			throw new InvalidInput("Invalid Input Id Alreadt Exsists!");
		}
	}

	@Override
	public String toString() {
		return "Employees [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}

}