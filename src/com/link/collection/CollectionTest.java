package com.link.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
java.util.Collection中的常用方法
*/

public class CollectionTest {
	public static void main(String[] args) {
		Collection<Object> c = new ArrayList<>();

		// add()
		c.add(100); // 自动装箱
		c.add(true); // 自动装箱
		c.add(new Object());
		c.add("hello");

		// size()
		System.out.println("集合中的元素的个数：" + c.size());

		// contains()
		System.out.println("集合中是否包含'hello'? " + (c.contains("hello") ? "包含" : "不包含"));

		// remove()
		c.remove("hello");

		// isEmpty()
		System.out.println("集合是否为空? " + (c.isEmpty() ? "是" : "否"));

		// toArray()
		Object[] objs = c.toArray();
		for (Object o : objs) {
			System.out.println(o);
		}

		System.out.println(c);
	}
}
