package com.te.factorydesignpatterns;

public class TommyHilfiger implements Company{

	@Override
	public void tshirt() {
		System.out.println("Starting prices from 18$");
		
	}

	@Override
	public void jeans() {
	System.out.println("Prices start from 22$");
		
	}

	@Override
	public void shoes() {
		System.out.println("Prices Start from 29$");
		
	}

}
