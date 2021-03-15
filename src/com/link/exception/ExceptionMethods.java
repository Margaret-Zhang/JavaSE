package com.link.exception;

/*
异常对象有两个常用的方法
	获取异常简单的描述信息
		String msg = exception.getMessage();
	打印异常追踪的堆栈信息
		exception.printStackTrace();
*/

public class ExceptionMethods {
	public static void main(String[] args) {
		// 创建异常对象，如果没有抛出，JVM会认为这是一个普通的java对象
		NullPointerException e = new NullPointerException("空指针异常");
		String msg = e.getMessage();
		System.out.println(msg);
		
		// 打印异常堆栈信息是异步线程的
		e.printStackTrace();
	}
}
