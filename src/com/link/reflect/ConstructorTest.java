package com.link.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import com.link.reflect.bean.Student;

/*
通过反射机制获取类的构造器
*/

public class ConstructorTest {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Class studentClass = null;

		try {
			studentClass = Class.forName("com.link.reflect.bean.Student");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("完整类名：" + studentClass.getName());
		System.out.println("简类名：" + studentClass.getSimpleName());

		// 获取构造器类数组
		Constructor[] constructors = studentClass.getDeclaredConstructors();
		for (Constructor c : constructors) {
			// 获取每一个构造器的修饰符
			System.out.print(Modifier.toString(c.getModifiers()));
			// 构造器名字即为类名
			System.out.print(" " + studentClass.getSimpleName());
			System.out.print("(");
			// 获取构造器的参数类型
			Class[] paramTypes = c.getParameterTypes();
			for (int i = 0; i < paramTypes.length; ++i) {
				if (i == paramTypes.length - 1) {
					System.out.print(paramTypes[i].getSimpleName());
				} else {
					System.out.print(paramTypes[i].getSimpleName() + ", ");
				}
			}
			System.out.print(")\n");
		}

		// 使用反射机制获取构造器并实例化对象
		try {
			Constructor studentConstructor = studentClass.getDeclaredConstructor(int.class, String.class, int.class,
					boolean.class);
			Object obj = studentConstructor.newInstance(1000, "zoey", 19, false);
			System.out.println(obj instanceof Student);
			System.out.println(obj);
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}

	}
}
