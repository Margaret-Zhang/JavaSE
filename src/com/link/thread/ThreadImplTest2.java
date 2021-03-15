package com.link.thread;

/*
采用匿名内部类的方式创建线程
*/

public class ThreadImplTest2 {
	public static void main(String[] args) {
		// 创建线程对象
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 100; ++i) {
					System.out.println("分支线程-->" + i);
				}
			}
		});
		
		// 启动线程
		t.start();
		
		for(int i = 0; i < 100; ++i) {
			System.out.println("主线程-->" + i);
		}
	}
}
