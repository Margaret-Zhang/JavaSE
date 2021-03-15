package com.link.date;

import java.util.Date;

public class CurrentTimeMillisTest {
	public static void main(String[] args) {
		// 获取自1970-01-01 00：00：00 000到系统当前时间的毫秒数
		long nowTimeMillis = System.currentTimeMillis();
		Date nowTime = new Date(nowTimeMillis);
		System.out.println(nowTime);
	}
}
