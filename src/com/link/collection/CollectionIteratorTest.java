package com.link.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
迭代器在Collections以及子类中使用，Map集合不能使用迭代器
集合的结构发生变化时(集合元素的添加或者删除)，迭代器需要重新获取
*/

public class CollectionIteratorTest {
	public static void main(String[] args) {
		Collection<Object> c = new HashSet<>();

		// 添加元素
		c.add("ABC");
		c.add(666);
		c.add(false);
		c.add(new Object());

		// 获取迭代器对象，遍历集合
		Iterator<Object> it = c.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		// 删除集合中某个元素后没有更新迭代器，会出现异常java.util.ConcurrentModificationException
//		Iterator<Object> it2 = c.iterator();
//		c.remove("ABC");
//		while (it2.hasNext()) {
//			Object obj = it2.next();
//			System.out.println(obj);
//		}
		
		// 使用迭代器删除元素不会出现异常
		Iterator<Object> it3 = c.iterator();
		while(it3.hasNext()) {
			Object obj = it3.next();
			if(obj.equals("ABC")) {
				it3.remove();
			}
		}
		
		for(Object o : c) {
			System.out.println(o);
		}
	}
}
