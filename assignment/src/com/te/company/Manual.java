package com.te.company;

public class Manual extends Tester {

	Manual(String ename, String designation, double sal) {
		super(ename, designation, sal);
	}
	public static int mcount=0;
	public void test() {
		System.out.println("Do Manual testing");
		
	}
	public void experience() {
		System.out.println("Experience on manual testing");
		
	}
	{
		mcount++;
	}
	

}