package com.link.thread;

import com.link.thread.bean.BackupThread;

/*
守护线程
*/

public class ThreadDaemonTest {
	public static void main(String[] args) {
		Thread t = new BackupThread();
		t.setName("备份线程");
		// 启动线程之前，将线程设置为守护线程
		t.setDaemon(true);
		t.start();

		Thread.currentThread().setName("主线程");
		for (int i = 1; i <= 10; ++i) {
			System.out.println(Thread.currentThread().getName() + "-->" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
