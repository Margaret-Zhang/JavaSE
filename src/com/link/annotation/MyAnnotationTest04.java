package com.link.annotation;

public class MyAnnotationTest04 {
	public static void main(String[] args) {
		
	}
	
	@MyAnnotation(name="abc", age=21)
	public static void m() {
		System.out.println("Hello");
	}
}
