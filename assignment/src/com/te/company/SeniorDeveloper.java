package com.te.company;


public class SeniorDeveloper extends Developer {

	SeniorDeveloper(String ename,String designation, double sal) {
		super(ename,designation, sal);
		
	}
	public static int scount=0;
	@Override
	public void code() {
		System.out.println("Senior Developer writes code");
		
	}

	@Override
	public void project() {
		System.out.println("works on live projects");
		
	}

	@Override
	public void experience() {
		System.out.println("Have good experience");
	}
	{
		scount++;
	}


}