package com.link.thread.bean;

import java.util.List;

public class Consumer implements Runnable {
	@SuppressWarnings("rawtypes")
	private List list;

	@SuppressWarnings("rawtypes")
	public Consumer(List list) {
		this.list = list;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (list) {
				if (list.size() == 0) {
					try {
						// 当前线程进入等待状态，并且释放Consumer之前占有的list集合的锁
						list.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					System.out.println("消费者线程删除元素：" + list.remove(0));
					// 唤醒生产者线程
					list.notify();
				}
			}
		}
	}
}
