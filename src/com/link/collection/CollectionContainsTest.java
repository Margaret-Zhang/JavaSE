package com.link.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
深入解析Collection集合的contains()方法
ArrayList集合的contains()方法会调用String类的equals()方法进行对比
结论：存储在集合中的数据类型一定要重写equals()方法！！！
*/

public class CollectionContainsTest {
	public static void main(String[] args) {
		Collection<Object> c = new ArrayList<>();

		String s1 = new String("Hello");
		c.add(s1);

		String s2 = new String("World");
		c.add(s2);

		System.out.println("集合中元素的个数：" + c.size());

		String s3 = new String("Hello");
		System.out.println(c.contains(s3)); // true
	}
}
