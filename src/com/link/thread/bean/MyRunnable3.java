package com.link.thread.bean;

public class MyRunnable3 implements Runnable {
	// 打一个布尔标记
	public boolean flag = true;

	@Override
	public void run() {
		for (int i = 0; i < 10; ++i) {
			if (flag) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				// 终止当前线程
				return;
			}
		}
	}
}
