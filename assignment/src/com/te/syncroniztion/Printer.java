package com.te.syncroniztion;

public class Printer {
	int pages;

	public Printer(int pages) {
		super();
		this.pages = pages;
	}

	public void print(int pages) {
		if (pages > 0) {
			this.pages += pages;
		}
	}

	public void printed() {
		System.out.println(pages);
	}
}