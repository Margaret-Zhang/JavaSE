package com.link.iostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
java.io.PrintStream标准输出流，默认打印到控制台
标准输出流不需要关闭
*/

public class PrintStreamTest {
	public static void main(String[] args) {
		System.out.println("Hello, world!");

		PrintStream ps = System.out;
		ps.println("Hello, world!");

		// 改变标准输出流的输出方向
		PrintStream ps2;
		try {

			ps2 = new PrintStream(new FileOutputStream("E:/example"));
			System.setOut(ps2);
			System.out.println("Hello");
			System.out.println("World");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
