package com.link.thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
java.util.Timer定时器
*/

public class TimerTest {
	public static void main(String[] args) {
		// 创建定时器对象
		Timer timer = new Timer();

		// 指定定时任务
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				System.out.println("Hello");
			}
		};
		Date firstTime = new Date();
		timer.schedule(task, firstTime, 1000 * 10);
	}
}
