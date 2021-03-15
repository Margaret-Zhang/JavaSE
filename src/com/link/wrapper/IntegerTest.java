package com.link.wrapper;

public class IntegerTest {
	public static void main(String[] args) {
		Integer integer = 100; // 自动装箱
		System.out.println(integer);

		String str = "中文";
		// 将字符串转换为Integer
		int retValue = Integer.parseInt(str); // NumberFormatException
		System.out.println(retValue);
		
		// 十进制数字转换为二进制
		System.out.println(Integer.toBinaryString(4));
	}
}
