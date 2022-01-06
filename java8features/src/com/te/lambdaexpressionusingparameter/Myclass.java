package com.te.lambdaexpressionusingparameter;

public class Myclass {
	public int add(int x, int y) {
		return x+y;

	}
	public int sub(int x, int y) {
		return x-y;

	}
	public int addition(int x, int y) {
		return x+y;

	}
	public static void main(String[] args) {
		Test test=new Myclass()::add;// here that double colon indicates that the cureent object is reference to add method
		System.out.println(test.add(10, 20));
		
//		System.out.println("===========");
//		Test test2 = (x, y) -> {//here i am using lambda expression
//			System.out.println("addition" + x + y);
//		};
		
		
//		test2.add(5, 4);
//		System.out.println("=======");
//		Runnable run = () -> {//here i am using runnable interface
//			for (int i = 0; i <= 5; i++) {
//				System.out.println(i);
//			}
//		};
//		Thread thread = new Thread(run);
//		thread.start();
	}
}
