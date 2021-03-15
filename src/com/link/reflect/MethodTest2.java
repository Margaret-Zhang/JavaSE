package com.link.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.link.reflect.bean.Student;

/*
通过反射机制调用一个对象的方法
*/

public class MethodTest2 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Student stu1 = new Student(1000, "zoey", 21, false);
		Class studentClass = null;

		try {
			studentClass = Class.forName("com.link.reflect.bean.Student");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			// 获取Student类中的study方法类
			Method studyMethod = studentClass.getDeclaredMethod("study", int.class);
			// 执行方法
			studyMethod.invoke(stu1, 10);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
