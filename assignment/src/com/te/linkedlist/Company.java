package com.te.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Employee> list = new LinkedList<Employee>();
		list.add(new Employee(2, "Vivek", 100000));
		list.add(new Employee(3, "Rakshit", 20000000));
		list.add(new Employee(1, "Aayush", 1500000));
		list.add(new Employee(4, "Wade", 3000000));
		for (Employee e : list) {
			System.out.println(e);
		}
		System.out.println("Comparable	");
		System.out.println("===============");
		Collections.sort(list);
		for(Employee e:list) {
			System.out.println(e);
		}
		System.out.println("Comparator");
		System.out.println("===============");
		Collections.sort(list,new SortByName());
		for(Employee e: list) {
			System.out.println(e);
		}
	}

}