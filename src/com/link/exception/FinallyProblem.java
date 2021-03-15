package com.link.exception;

/*
final: 关键字，修饰的变量表示最终的
finally: 关键字，与try联合使用
finalize: 标识符，Object类的成员方法
*/

public class FinallyProblem {
	public static void main(String[] args) {
		int result = m();
		System.out.println(result); // 100
	}

	public static int m() {
		int i = 100;
		try {
			return i;
		} finally {
			i++;
		}
	}
}
