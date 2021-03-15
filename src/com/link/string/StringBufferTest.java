package com.link.string;

/*
当程序需要频繁的字符串拼接操作，建议使用JDK的StringBuffer和StringBuilder类
*/

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer(); // StringBuffer初始化容量是16
		// 字符串追加/拼接
		str1.append("It is ");
		str1.append("not ");
		str1.append(true);
		
		System.out.println(str1);
	}
}
