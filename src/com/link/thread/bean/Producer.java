package com.link.thread.bean;

import java.util.List;

public class Producer implements Runnable {
	@SuppressWarnings("rawtypes")
	private List list;

	@SuppressWarnings("rawtypes")
	public Producer(List list) {
		this.list = list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void run() {
		while (true) {
			synchronized (list) {
				if (list.size() > 10) {
					try {
						// 当前线程进入等待状态，并且释放Producer之前占有的list集合的锁
						list.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					Object obj = new Object();
					list.add(obj);
					System.out.println("生产者线程添加元素：" + obj);
					// 唤醒消费者线程
					list.notify();
				}
			}
		}
	}
}
