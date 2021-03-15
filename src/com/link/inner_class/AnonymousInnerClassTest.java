package com.link.inner_class;

import java.util.Scanner;

public class AnonymousInnerClassTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b;
		System.out.println("请输入要相加的两个数：");
		a = scanner.nextInt();
		b = scanner.nextInt();

		// 匿名内部类(Calculate类的匿名实现类)
		MyMath.mySum(new Calculate() {
			public int sum(int a, int b) {
				return a + b;
			}
		}, a, b);
		scanner.close();
	}
}
