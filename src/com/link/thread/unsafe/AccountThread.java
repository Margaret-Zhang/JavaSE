package com.link.thread.unsafe;

public class AccountThread extends Thread {
	// 两个线程必须共享同一个账户对象
	private Account account;

	public AccountThread(Account account) {
		this.setAccount(account);
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		account.withdraw(5000);
	}
}
