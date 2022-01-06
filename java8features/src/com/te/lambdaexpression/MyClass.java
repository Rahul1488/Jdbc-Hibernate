package com.te.lambdaexpression;

public class MyClass {
	public static void main(String[] args) {
		Test test = new Test() {
			@Override
			public void messege() {
				System.out.println("Hello Buddy!!!!");
			}
		};
		test.messege();
		System.out.println("===================");
		Test test1 = () -> {
			System.out.println("Hi Buddy");
		};
		test1.messege();

	}
}
