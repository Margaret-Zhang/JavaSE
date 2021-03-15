package com.link.thread.safe;

public class AccountTest {
	public static void main(String[] args) {
		Account account = new Account("1111", 8000);
		AccountThread t1 = new AccountThread(account);
		AccountThread t2 = new AccountThread(account);

		t1.start();
		t2.start();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(account.getBalance());
	}
}
