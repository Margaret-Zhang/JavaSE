package com.link.annotation;

public @interface MyAnnotation {
	// 注解的name属性
	String name();
	
	// 属性指定默认值
	int age() default 20;
}
