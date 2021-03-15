package com.link.thread;

import com.link.thread.bean.MyRunnable2;

/*
利用异常机制中断线程的睡眠，唤醒线程
*/

public class ThreadInterruptTest {
	public static void main(String[] args) {
		Thread t = new Thread(new MyRunnable2());
		
		t.start();
		
		// 等待5秒后唤醒线程
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t.interrupt();
	}
}
