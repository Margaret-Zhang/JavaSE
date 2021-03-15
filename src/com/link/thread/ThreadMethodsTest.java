package com.link.thread;

import com.link.thread.bean.MyThread;

public class ThreadMethodsTest {
	public static void main(String[] args) {
		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread();
		// 获取线程名字
		System.out.println(mt1.getName());
		System.out.println(mt2.getName());

		// 修改线程名字
		mt1.setName("Thread-I");
		mt2.setName("Thread-II");

		// 获取线程名字
		System.out.println(mt1.getName());
		System.out.println(mt2.getName());

		mt1.start();
		mt2.start();

		// 获取当前线程对象(主线程)
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
	}
}
