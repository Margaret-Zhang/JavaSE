package com.link.exception;

/*
自定义异常类
第一步：编写一个类继承Exception或者RuntimeException
第二步：提供两个构造器，无参构造和以String参数的构造
*/

public class MyException extends Exception {
	private static final long serialVersionUID = 6071870766872788605L;

	public MyException() {
		super();
	}

	public MyException(String s) {
		super(s);
	}
}
