package com.link.object;

/*
Object类的equals()方法：
	public boolean equals(Object obj) {
		return (this == obj);
	}
equals()方法实现的目的是判断两个对象是否相等，而默认实现只是比较两个对象的内存地址，并不比较对象内容。

*/

public class EqualsTest {
	public static void main(String[] args) {
		MyTime t1 = new MyTime(2008, 8, 8);
		MyTime t2 = new MyTime(2008, 8, 8);
		// System.out.println(t1.equals(t2)); // 重写equals()方法之前是false，两个对象的内存地址不一样

		System.out.println(t1.equals(t2)); // 重写equals()方法后是true
	}
}