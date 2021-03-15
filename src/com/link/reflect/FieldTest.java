package com.link.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.link.reflect.bean.Student;

/*
使用反射机制获取属性
*/

public class FieldTest {
	@SuppressWarnings({ "rawtypes" })
	public static void main(String[] args) {
		// 获取bean包下的Student类
		Class studentClass = null;
		try {
			studentClass = Class.forName("com.link.reflect.bean.Student");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("完整类名：" + studentClass.getName());
		System.out.println("简类名：" + studentClass.getSimpleName());

		// 获取类中所有已声明的属性以及其类型
		// getFields方法只能获取能访问到的属性
		Field[] fields = studentClass.getDeclaredFields();
		for (Field f : fields) {
			// 获取属性的修饰符
			String mod = Modifier.toString(f.getModifiers());
			if ("".equals(mod)) {
				System.out.print(mod);
			} else {
				System.out.print(mod + " ");
			}

			// 获取属性类型
			System.out.print(f.getType().getSimpleName());
			// 获取属性名字
			System.out.println(" " + f.getName());
		}

		// 通过获取Field对象，改变Student对象的属性，不使用Student对象的set方法
		Student stu1 = new Student(1000, "jack", 19, true);
		System.out.println(stu1);
		try {
			// 获取Student类中的no属性
			Field nameFiled = studentClass.getDeclaredField("no");
			// 改变stu1对象的no属性值
			nameFiled.set(stu1, 2000);
			// 访问stu1对象的no属性值
			System.out.println(nameFiled.get(stu1));
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		System.out.println(stu1);

		// 打破封装，访问stu1对象的私有属性
		try {
			// 获取Student类中的name属性类
			Field nameField = studentClass.getDeclaredField("name");
			// 修改访问权限
			nameField.setAccessible(true);
			// 修改stu1中的name属性值
			nameField.set(stu1, "zoey");
			// 访问stu1中的name属性值
			System.out.println(nameField.get(stu1));
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		System.out.println(stu1);
	}
}
