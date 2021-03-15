package com.link.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
实现多线程的第三种方式
*/

public class ThreadCallableTest {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// 创建一个FutureTask对象
		FutureTask task = new FutureTask(new Callable() {
			// call方法相当于run方法，只不过这个方法有返回值
			@Override
			public Object call() throws Exception {
				System.out.println("call method begin");
				Thread.sleep(1000 * 5);
				System.out.println("call method end");
				return 300;
			}
		});

		// 创建线程对象
		Thread t = new Thread(task);

		// 启动线程
		t.start();

		// 获取线程的返回结果
		try {
			// 会阻塞main方法的执行，因为只有线程运行完才能返回一个值
			System.out.println(task.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
}
