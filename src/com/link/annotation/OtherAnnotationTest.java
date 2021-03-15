package com.link.annotation;

public class OtherAnnotationTest {
	public static void main(String[] args) {
		doSome();
	}

	@OtherAnnotation(age = 15, email = { "zhangsan@136.com", "zhangsan@gmail.com" })
	public static void doSome() {

	}
}
