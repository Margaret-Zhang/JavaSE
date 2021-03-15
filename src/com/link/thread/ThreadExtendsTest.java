package com.link.thread;

import com.link.thread.bean.MyThread;

/*
java实现多线程的第一个方式：继承java.lang.Thread，并重写run方法
创建一个线程的对象，调用start方法，JVM分配出一个新的栈给分支线程
*/

public class ThreadExtendsTest {
	public static void main(String[] args) {
		// 创建线程对象
		MyThread mt1 = new MyThread();

		// 启动分支线程
		mt1.start();

		for (int i = 0; i < 100; ++i) {
			System.out.println("主线程执行-->" + i);
		}
	}
}
