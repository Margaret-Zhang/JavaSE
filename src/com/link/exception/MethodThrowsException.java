package com.link.exception;

/*
编译时异常和运行时异常都是在运行时执行的
编译时异常需要预先处理(throws/try...catch)
*/

public class MethodThrowsException {
	public static void main(String[] args) {
		// method()方法可能会抛出异常(编译时)，需要预先处理
		// 第一种处理方式是main方法继续抛给上一级调用者

		// 第二种处理方式是try...catch捕捉异常
		try {
			method();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 声明时抛出异常给调用者
	public static void method() throws ClassNotFoundException {
		System.out.println("...");
	}
}
