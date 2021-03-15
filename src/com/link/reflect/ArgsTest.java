package com.link.reflect;

/*
可变长参数在形参中只能有一个，并且在最后一个位置
*/

public class ArgsTest {
	public static void main(String[] args) {
		m1();
		m1(1, 2);
		m1(1, 2, 3);

		int[] arr = new int[] { 1, 2, 3 };
		m2(10, arr);
	}

	// 可变长参数
	public static void m1(int... args) {
		System.out.println("m1");
	}

	// 可变长参数可以看作是一个数组
	public static void m2(int i, int... args) {
		System.out.println("m2");
	}
}
