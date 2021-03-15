package com.link.annotation;

@Deprecated
public class MyAnnotationTest03 {
	public static void main(String[] args) {
		m();
	}

	@Deprecated
	public static int code;

	@Deprecated
	public static void m() {
		System.out.println("Hello");
	}
}
