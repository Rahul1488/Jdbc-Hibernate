package com.te.syncroniztion;


public class Tejas extends Thread {

	Printer printer;

	public Tejas(Printer printer) {
		super();
		this.printer = printer;
	}

	@Override
	synchronized public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		System.out.println("tejas Your prints are done");
	}
}