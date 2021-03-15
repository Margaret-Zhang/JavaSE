package com.link.reflect;

public class ClassForNameTest {
	public static void main(String[] args) {
		try {
			// Class.forName()会导致类的加载，所以当你想让一个类的静态代码块执行时，可以使用Class.forName方法
			Class.forName("com.link.reflect.bean.FreeBSD");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
