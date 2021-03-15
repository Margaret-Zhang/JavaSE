package com.link.thread;

import com.link.thread.bean.MyRunnable3;

public class ThreadStopTest2 {
	public static void main(String[] args) {
		MyRunnable3 r = new MyRunnable3();
		Thread t = new Thread(r);
		t.start();

		// 主线程睡眠5秒
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// 修改标记停止线程
		r.flag = false;
	}
}
