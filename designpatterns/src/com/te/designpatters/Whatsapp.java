package com.te.designpatters;

public class Whatsapp {
	private static Whatsapp whatsapp;// we are declaring private here because we are not allowing user to acess
										// another object of same type

	private Whatsapp() {

	}

	static Whatsapp helperMethod() {
		if (whatsapp == null) {// here if the object is created previously the if condition dosent allows to
								// create object and it returns the old object address
			whatsapp = new Whatsapp();
			return whatsapp;
		}
		return whatsapp;

	}
}
