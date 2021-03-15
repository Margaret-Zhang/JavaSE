package com.link.thread.unsafe;

public class Account {
	private String no;
	private double balance;

	public Account(String no, double balance) {
		super();
		this.no = no;
		this.balance = balance;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	// 线程异步：两个线程同时对一个数据进行访问，t1线程取款成功后，发生网络延迟，数据未发生改变，t2线程也来取款
	public void withdraw(double money) {
		if (money > balance) {
			System.out.println("取款失败！余额不足！");
			return;
		}

		double after = balance - money;

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		setBalance(after);
		System.out.println("取款" + money + "成功！");
	}

	@Override
	public String toString() {
		return "no: " + no + ", balance: " + balance;
	}
}
