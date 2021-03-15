package com.link.object;

import java.util.Date;

class MyTime {
	private int year;
	private int month;
	private int day;

	public MyTime() {

	}

	public MyTime(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public String toString() {
		return year + "-" + month + "-" + day;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof MyTime))
			return false;
		if (obj == this)
			return true;
		MyTime t = (MyTime) obj;
		return (t.year == this.year && t.month == this.month && t.day == this.day);
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("[" + new Date() + "] MyTime对象被回收");
	}
}