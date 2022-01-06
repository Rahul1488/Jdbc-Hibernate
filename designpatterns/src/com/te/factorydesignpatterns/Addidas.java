package com.te.factorydesignpatterns;

public class Addidas implements Company {

	@Override
	public void tshirt() {
		System.out.println("prices start from 15$");

	}

	@Override
	public void jeans() {
		System.out.println("We dont sell jeans here but we sell Track pants starting from 30$");

	}

	@Override
	public void shoes() {
		System.out.println("Accha sastha shoes at 25$");

	}

}
