package com.te.company;

public class Intern extends Developer{

	
	Intern(String ename,String designation, double sal) {
		super(ename, designation, sal);
	}
	public static int Interncount=0;
			@Override
	public void code() {
		System.out.println("Intern does coding");
		
	}

	@Override
	public void project() {
		System.out.println("works on pseudo live projects");
	}

	@Override
	public void experience() {
		System.out.println("Has no experience");
		
	}
	{
		Interncount++;
	}
	

}