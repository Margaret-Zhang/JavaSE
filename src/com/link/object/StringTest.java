package com.link.object;

public class StringTest {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		System.out.println(str1 == str2); // true 都位于字符串常量池的同一个地址

		String str3 = new String("abc");
		String str4 = new String("abc");
		System.out.println(str3 == str4); // false 比较两个对象的内存地址
		System.out.println(str3.equals(str4)); // true String类已经重写equals()方法
		
		System.out.println(str4); // String类已经重写toString()方法
	}
}
