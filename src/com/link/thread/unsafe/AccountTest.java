package com.link.thread.unsafe;

public class AccountTest {
	public static void main(String[] args) {
		Account account = new Account("1111", 5000);
		AccountThread t1 = new AccountThread(account);
		AccountThread t2 = new AccountThread(account);

		t1.start();
		t2.start();

		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(account.getBalance());
	}
}
