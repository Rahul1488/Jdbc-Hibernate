package com.te.factorydesignpatterns;

public class Puma implements Company {

	@Override
	public void tshirt() {
		System.out.println("Prices start from 15$");

	}

	@Override
	public void jeans() {
		System.out.println("Prices start from 20$");

	}

	@Override
	public void shoes() {
		System.out.println("Starting from 35$");

	}

}
