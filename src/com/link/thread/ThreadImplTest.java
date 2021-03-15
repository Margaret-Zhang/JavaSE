package com.link.thread;

import com.link.thread.bean.MyRunnable;

public class ThreadImplTest {
	public static void main(String[] args) {
		// 创建线程对象
		Thread t1 = new Thread(new MyRunnable());

		// 启动分支线程
		t1.start();

		for (int i = 0; i < 100; ++i) {
			System.out.println("主线程-->" + i);
		}
	}
}
