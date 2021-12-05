package com.te.company;


public class Feed {

	public static void main(String[] args) {
	    Extract e  = new Extract();
		Intern i = new Intern("Mr Bean","intern",60000);
		SeniorDeveloper sd = new SeniorDeveloper("tom","intern",70000);
		Manual m = new Manual("jerry","Manual tester",40000);
		Automation a = new Automation("oggy","Automation tester",50000);
		Hr 	h = new Hr("Bob","HR",100000);
		e.get(i);
		System.out.println("____________________________________");
		e.get(m);
		System.out.println("_____________________________________");
		e.get(sd);
		System.out.println("_____________________________________");
		e.get(a);
		System.out.println("_____________________________________");
		e.get(h);
		System.out.println("______________________________________");
		Employee ee = new Employee();
		
	}

}
