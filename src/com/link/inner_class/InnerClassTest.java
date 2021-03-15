package com.link.inner_class;

/*
内部类的分类：
1. 静态内部类：类似于静态变量
2. 实例内部类：类似于实例变量
3. 局部内部类：类似于局部变量

匿名内部类是局部内部类的一种，因匿名而得名。
*/

public class InnerClassTest {
	public static void main(String[] args) {
		method();
	}

	// 静态内部类
	static class InnerStaticClass {
	}

	// 实例内部类
	class InnerIntanceClass {
	}

	public static void method() {
		// 局部内部类
		class InnerLocalClass {
		}

		InnerLocalClass obj = new InnerLocalClass();
		System.out.println(obj);
	}
}
