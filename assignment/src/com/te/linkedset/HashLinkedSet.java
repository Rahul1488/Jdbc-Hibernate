package com.te.linkedset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashLinkedSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(50);
		linkedHashSet.add(10);
		linkedHashSet.add(25);
		linkedHashSet.add(10);
		linkedHashSet.add(60);
		linkedHashSet.add(11);
		Iterator<Object> iterator = linkedHashSet.iterator();
		while (iterator.hasNext()) {
//			Object object = (Object) iterator.next();
//			System.out.println(object);
			System.out.println(iterator.next());
		}
	}

}