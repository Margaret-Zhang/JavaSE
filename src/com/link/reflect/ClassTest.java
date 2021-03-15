package com.link.reflect;

/*
获取Class的三种方式：
1. Class.forName(String)
2. obj.getClass() java中任何一个对象都有getClass方法
3. class属性，java中任何一个数据类型(包括基本数据类型)都有class属性

通过反射实例化对象：
Class对象.newInstance() 调用此类的无参构造器
*/

public class ClassTest {
	public static void main(String[] args) {
		// 获取Class的三种方式
		Class<?> c1 = null;
		Class<?> c2 = null;

		try {
			c1 = Class.forName("java.lang.String");
			c2 = Class.forName("java.util.Date");
			System.out.println(c1.getName());
			System.out.println(c2.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Class<?> c3 = "abc".getClass();
		System.out.println(c3.getName());
		System.out.println(c1 == c3); // true

		Class<?> c4 = int.class;
		Class<?> c5 = String.class;
		System.out.println(c4); // int
		System.out.println(c3 == c5); // true
		
		// 通过反射机制实例化对象
		try {
			// 调用String的无参构造器实例化对象
			Object obj = c1.newInstance();
			System.out.println(obj.getClass().getName());
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
