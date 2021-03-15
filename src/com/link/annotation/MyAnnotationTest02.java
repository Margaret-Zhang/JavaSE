package com.link.annotation;

/*
@Override这个注解只能用于方法上
在编译时编译器会检测被注解的方法是否真正重写了父类的toString方法，在运行时注解不起作用。
建议重写父类的方法时用@Override这个注解
*/

public class MyAnnotationTest02 {
	@Override
	public String toString() {
		return "Hello";
	}
}
