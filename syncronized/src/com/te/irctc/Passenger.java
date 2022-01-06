package com.te.irctc;

public class Passenger extends Thread {
	TicketBooking book;
	int noOfTickets;
	String name;

	public Passenger(TicketBooking book, int noOfTickets, String name) {
		super();
		this.book = book;
		this.noOfTickets = noOfTickets;
		this.name = name;
	}

	@Override
	public void run() {
		book.bookTickets(noOfTickets, name);
	}
}
