package com.link.reflect;

/*
通过反射机制获取一个类的父类和已实现的接口
*/

public class SuperClassTest {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Class stringClass = null;
		
		try {
			stringClass = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// 获取String类的父类
		Class superClass = stringClass.getSuperclass();
		System.out.println(superClass.getSimpleName());
		
		// 获取String类实现的所有接口，一个类可以实现多个接口
		Class[] interfaces = stringClass.getInterfaces();
		for(Class i : interfaces) {
			System.out.println(i.getSimpleName());
		}
	}
}
