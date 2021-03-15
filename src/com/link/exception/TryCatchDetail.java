package com.link.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
try...catch语句块里可以有多个catch，但是捕捉异常必须从小到大的顺序
finally子句最后执行，并且一定执行
*/

public class TryCatchDetail {
	public static void main(String[] args) {

		// JDK8的新特性：catch(Exception1 | Exception2 | Exception3 e)
		FileInputStream fis = null;
		try {
			// 创建输入流
			fis = new FileInputStream("/home/link/test.txt");
			// 进行数学运算
			System.out.println(10 / 0); // 运行时异常，可以不处理
		} catch (FileNotFoundException | ArithmeticException | NullPointerException e) {
			e.printStackTrace();
		} finally {
			if (null != fis) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("出不出异常都会执行的代码！！！");
		}
	}
}
