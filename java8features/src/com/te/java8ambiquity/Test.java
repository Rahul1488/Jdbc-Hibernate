package com.te.java8ambiquity;

public interface Test {
default void m1()
{
	System.out.println("from test");
}
}
