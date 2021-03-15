package com.link.thread.bean;

public class BackupThread extends Thread {
	@Override
	public void run() {
		int i = 0;
		while (true) {
			System.out.println(Thread.currentThread().getName() + "-->" + (++i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
