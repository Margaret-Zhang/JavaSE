package com.link.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) throws ParseException {
		// 获取系统当前时间
		Date nowTime = new Date();
		System.out.println(nowTime);

		// 日期格式化 Date --> String
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		String nowTimeString = sdf.format(nowTime);
		System.out.println(nowTimeString);

		// String --> Date
		String timeString = "2008-08-08 08:08:08";
		sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		Date date = sdf.parse(timeString);
		System.out.println(date);
	}
}
