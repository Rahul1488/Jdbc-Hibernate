package com.te.java8featuresexample;

public class Hello {
	public static void main(String[] args) {
		PhoneCall call = new Maharastra();
		PhoneCall call2 = new TamilNadu();
		PhoneCall call3 = new Karnataka();
		call.busyMessege();
		call2.busyMessege();
		call3.busyMessege();
		System.out.println("==========");
		call.covidAlert();
		call2.covidAlert();
		call3.covidAlert();

	}
}
