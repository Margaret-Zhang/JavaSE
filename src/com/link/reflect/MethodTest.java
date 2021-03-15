package com.link.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MethodTest {
	@SuppressWarnings({ "rawtypes" })
	public static void main(String[] args) {
		Class studentClass = null;
		try {
			studentClass = Class.forName("com.link.reflect.bean.Student");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("完整类名：" + studentClass.getName());
		System.out.println("简类名：" + studentClass.getSimpleName());

		Method[] methods = studentClass.getDeclaredMethods();
		for (Method m : methods) {
			// 获取方法的修饰符
			System.out.print(Modifier.toString(m.getModifiers()));
			// 获取方法的返回值类型
			System.out.print(" " + m.getReturnType().getSimpleName());
			// 获取方法名字
			System.out.print(" " + m.getName() + "(");
			// 获取方法参数的类型
			Class[] paramTypes = m.getParameterTypes();
			for (Class c : paramTypes) {
				System.out.print(" " + c.getSimpleName());
			}
			System.out.print(" )\n");
		}
	}
}
