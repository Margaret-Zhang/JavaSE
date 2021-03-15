package com.link.thread;

//import com.link.thread.bean.MyThread;

/*
sleep方法：让当前线程进入休眠，放弃占有CPU时间片，让给其它线程使用。参数是毫秒数。
*/

public class ThreadSleepTest {
	public static void main(String[] args) {
		try {
			// 让主线程进入休眠，睡眠2秒
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Hello, world!");

		for (int i = 0; i < 10; ++i) {
			System.out.println(Thread.currentThread().getName() + "-->" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

//		MyThread mt = new MyThread();
//		try {
//			mt.sleep(1000); // 只会让主线程睡眠1秒钟，sleep是静态方法，不存在继承
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("Hello, World!");
	}
}
