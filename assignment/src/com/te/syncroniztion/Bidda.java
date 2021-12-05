package com.te.syncroniztion;

public class Bidda extends Thread {
	Printer printer;

	public Bidda(Printer printer) {
		super();
		this.printer = printer;
	}

	@Override
	synchronized public void run() {
		for (int i = 1; i <= 2; i++) {
			System.out.println(i);
		}
		System.out.println("Bidda Your prints are done");
	}

}