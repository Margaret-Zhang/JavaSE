package com.link.thread.safe;

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

	// 线程同步代码块
	public void withdraw(double money) {
		// 线程同步关键字：synchronized，括号里填线程的共享对象
		synchronized (this) {
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
	}

	// 在实例方法上使用关键字synchronized，锁的对象只能是this，不灵活，而且同步的是整个方法体，可能降低程序的运行效率
	// 在静态方法上使用关键字synchronized，锁的是类锁，类锁只有一把
//	public synchronized void withdraw(double money) {
//			if (money > balance) {
//				System.out.println("取款失败！余额不足！");
//				return;
//			}
//
//			double after = balance - money;
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			setBalance(after);
//			System.out.println("取款" + money + "成功！");
//	}

	@Override
	public String toString() {
		return "no: " + no + ", balance: " + balance;
	}
}
