package com.link.annotation;

@MyAnnotation(name = "")
public class MyAnnotationTest01 {
	@MyAnnotation(name = "")
	private int no;

	@MyAnnotation(name = "")
	public MyAnnotationTest01() {

	}

	@MyAnnotation(name = "")
	public static void m() {
		@MyAnnotation(name = "")
		int i = 10;
		System.out.println(i);
	}
}

@MyAnnotation(name = "")
interface MyInterface {

}

@MyAnnotation(name = "")
enum Season {
	Spring, Summer, Autumn, Winter
}