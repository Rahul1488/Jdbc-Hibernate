package com.te.threadassignment;

public class Main {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		NumberThread numberThread = new NumberThread();
		AlphabeticalThread alphabeticalThread = new AlphabeticalThread();
		numberThread.setPriority(3);
		alphabeticalThread.setPriority(1);
		numberThread.join();
		alphabeticalThread.join();
		numberThread.start();
		alphabeticalThread.start();
	}

}
