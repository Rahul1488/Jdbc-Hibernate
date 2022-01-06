package com.te.irctc;

public class Irctc {
	public static void main(String[] args) {
		TicketBooking ticketBooking = new TicketBooking();
		Passenger siddu = new Passenger(ticketBooking, 10,"siddu");
		Passenger Bhushan = new Passenger(ticketBooking, 5,"Bhushan");
		Passenger praveen = new Passenger(ticketBooking, 15,"praveen");
		siddu.start();
		Bhushan.start();
		praveen.start();
		

	}
}
