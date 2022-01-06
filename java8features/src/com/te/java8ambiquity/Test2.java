package com.te.java8ambiquity;

public interface Test2 {
	default void m1() {
		System.out.println("from test 2");
	}
}
