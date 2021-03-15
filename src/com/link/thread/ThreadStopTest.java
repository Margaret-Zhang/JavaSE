package com.link.thread;

import com.link.thread.bean.MyRunnable;

/*
强行终止线程的执行
*/

public class ThreadStopTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Thread t = new Thread(new MyRunnable());
		t.start();

		try {
			// 主线程睡眠5秒
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// 强制杀死线程
		t.stop();
	}
}
