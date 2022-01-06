package com.te.java8featuresexample;

public interface PhoneCall {
void busyMessege();
default void covidAlert() {
	System.out.println("Amithab Bacchan is speaking");
}
}
