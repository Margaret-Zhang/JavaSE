package com.link.annotation;

public @interface OtherAnnotation {
	int age();

	// 注解的属性是个数组
	String[] email();
}
