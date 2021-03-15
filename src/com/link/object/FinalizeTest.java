package com.link.object;

/*
Object类的finalize()方法：
	protected void finalize() throws Throwable()
	该方法不需要成员手动调用，JVM的垃圾回收器负责调用这个方法。
调用时机：当一个对象被垃圾回收器回收时
*/

public class FinalizeTest {
	public static void main(String[] args) {
		MyTime t = null;
		for (int i = 0; i < 1000000; ++i) {
			t = new MyTime();
		}
		System.out.println(t);
	}
}
