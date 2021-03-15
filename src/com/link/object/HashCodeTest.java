package com.link.object;

/*
Object类的hashCode()方法：
	public native int hashCode();
native关键字表明调用底层从C++程序
hashCode()方法返回的是对象的内存地址经过哈希算法得到的值。
*/

public class HashCodeTest {
	public static void main(String[] args) {
		MyTime t = new MyTime(2020, 1, 30);
		System.out.println(t.hashCode());
	}
}
