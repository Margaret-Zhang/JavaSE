package com.link.exception;

public class MyExceptionTest {
	public static void main(String[] args) {
		// 创建自定义异常类的对象(未抛出)
		MyException e1 = new MyException("用户名不能为空！");
		// 打印异常堆栈信息
		e1.printStackTrace();
		
		// 处理方法中抛出的自定义异常对象
		try {
			m();
		} catch(MyException e2) {
			e2.printStackTrace();
		}
	}

	public static void m() throws MyException {
		throw new MyException("用户名不能为空！");
	}
}
