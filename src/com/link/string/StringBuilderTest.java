package com.link.string;

/*
StringBuilder与StringBuffer的区别：
	StringBuilder 速度快，但是线程不安全
	StringBuffer 速度慢，但是线程安全
*/

public class StringBuilderTest {
	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder(); // StringBuffer初始化容量是16
		// 字符串追加/拼接
		str1.append("It is ");
		str1.append("");
		str1.append(false);
		
		System.out.println(str1);
	}
}
