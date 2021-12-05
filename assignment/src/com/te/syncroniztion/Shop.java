package com.te.syncroniztion;

public class Shop {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Printer printer = new Printer(0);
		Tejas tejas = new Tejas(printer);
		Bidda bidda = new Bidda(printer);
		tejas.start();
		bidda.start();
		tejas.join();
		bidda.join();
		System.out.println("Executed");
		printer.printed();
	}

}