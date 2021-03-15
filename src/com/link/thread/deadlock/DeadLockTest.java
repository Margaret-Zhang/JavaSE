package com.link.thread.deadlock;

/*
死锁
*/

public class DeadLockTest {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();

		Thread t1 = new MyThread1(o1, o2);
		Thread t2 = new MyThread2(o1, o2);
		
		t1.start();
		t2.start();
	}
}
