package com.link.thread.bean;

public class MyRunnable2 implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "--> begin");

		// 子类重写的方法不能抛出比父类方法更多的异常，只能选择try...catch
		try {
			// 睡眠一年
			Thread.sleep(1000 * 60 * 60 * 24 * 365);
		} catch (InterruptedException e) {
//			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + "--> end");
	}
}
