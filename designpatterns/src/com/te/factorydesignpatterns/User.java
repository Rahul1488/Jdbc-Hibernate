package com.te.factorydesignpatterns;

import java.util.Scanner;

public class User {
public static void main(String[] args) {
	Outlet outlet = new Outlet();
	Scanner scanner = new  Scanner(System.in);
	System.out.println("Hello buddy which company outlet u wanna vist");
	String s= scanner.nextLine();
	outlet.outlet(s);
}
}
