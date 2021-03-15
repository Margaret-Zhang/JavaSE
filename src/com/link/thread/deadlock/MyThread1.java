package com.link.thread.deadlock;

public class MyThread1 extends Thread {
	Object o1;
	Object o2;

	public MyThread1(Object o1, Object o2) {
		this.o1 = o1;
		this.o2 = o2;
	}

	@Override
	public void run() {
		synchronized (o1) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (o2) {
				System.out.println("Hello");
			}
		}
	}
}
