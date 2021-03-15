package com.link.inner_class;

public class MyMath {
	public static void mySum(Calculate c, int a, int b) {
		int retValue = c.sum(a, b);
		System.out.println(a + " + " + b + " = " + retValue);
	}
}
