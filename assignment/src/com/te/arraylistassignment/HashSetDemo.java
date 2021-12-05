package com.te.arraylistassignment;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(3);
		set.add(25);
		set.add(101);
		set.add(10);//equals() method is implicitly called.
		set.add(30);//equals() method is implicitly called.
		for (Integer i : set) {
			System.out.println(i);
		}
		System.out.println("==================");
		Iterator iterator = set.iterator();
		//Over-riding Iterator methods.
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}