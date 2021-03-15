package com.link.object;

/*
Object类的toString()方法：
	public String toString() {
		return getClass().getName() + "@" + Integer.toHexString(hashCode());
	}

所有继承Object的类应该重写toString()方法，返回的字符串应该是简单、详实、易阅读的。

*/

public class ToStringTest {
	public static void main(String[] args) {
		MyTime time = new MyTime(2021, 1, 30);
		System.out.println(time);
	}
}