package com.link.thread;

import java.util.ArrayList;
import java.util.List;

import com.link.thread.bean.Consumer;
import com.link.thread.bean.Producer;

/*
使用wait和notify方法实现生产者和消费者模式
*/

public class ProducerConsumerModeTest {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		List list = new ArrayList();

		Thread t1 = new Thread(new Producer(list));
		Thread t2 = new Thread(new Consumer(list));
		t1.setName("生产者线程");
		t2.setName("消费者线程");

		t1.start();
		t2.start();
	}
}
