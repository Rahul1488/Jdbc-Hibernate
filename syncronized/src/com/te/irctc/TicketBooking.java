package com.te.irctc;

public class TicketBooking {
	int tickets = 20;

	public void bookTickets(int noOfTickets, String name) {
		System.out.println("Login Sucessfull");
		System.out.println("Welcome to IRCTC");
		System.out.println("Hello " + name);
		synchronized (this) {//it is a syncronised block and used for only few lines where it is required
			if (tickets < noOfTickets) {
				System.out.println("tickets are filled up");
				System.out.println("=============");
			} else {
				System.out.println(noOfTickets + "tickets are booked");
				tickets -= noOfTickets;
				System.out.println("number of tickets left " + tickets);
				System.out.println("=============");
			}

		}
		System.out.println("Thank You !Happy Journey");
	}
}
