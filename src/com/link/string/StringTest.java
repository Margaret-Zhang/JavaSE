package com.link.string;

public class StringTest {
	public static void main(String[] args) {
		String s1 = new String("java");
		String s2 = new String("java");
		System.out.println(s1 == s2); // 堆里面的两个对象指向同一个字符串，但是本身地址不同

		String s3 = "hello";
		String s4 = "hello";
		System.out.println(s3 == s4); // 局部变量指向字符串常量池的同一个字符串

		// 构造方法
		byte[] bytes = new byte[] { 97, 98, 99 };
		String s5 = new String(bytes);
		System.out.println(s5);

		char[] chars = new char[] { 'H', 'e', 'l', 'l', 'o' };
		String s6 = new String(chars);
		System.out.println(s6);

		// 成员方法
		String s7 = "    https github com    ";
		System.out.println(s7.trim()); // 去除前导和后导空白

		boolean flag = true;
		System.out.println(String.valueOf(flag)); // 将非字符串数值转换为字符串(静态方法)
		// 当String.valueOf()方法参数是引用数据类型时，底层调用对象的toString()方法
	}
}
