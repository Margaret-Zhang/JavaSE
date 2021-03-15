package com.link.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/*
List集合是Collection集合的子接口，拥有特有的成员方法
*/

public class ListTest {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		list.add(new Object());
		list.add("hello");
		list.add("bspwm");
		
		// add(index, element)
		list.add(2, "world");
		
		// 用迭代器遍历List集合
		Iterator<Object> it = list.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		// List集合特有的遍历方式
		for(int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}
		
		// indexOf(object) 获取指定对象第一次出现位置的索引
		System.out.println(list.indexOf("hello"));
		
		// lastIndexOf(object) 获取指定对象第一次出现位置的索引
		System.out.println(list.lastIndexOf("bspwm"));
		
		// remove(index) 删除指定索引的元素
		list.remove(0);
		
		// set(index, element) 修改指定位置的元素
		list.set(1, "java");
		
		for(Object o : list) {
			System.out.println(o);
		}
	}
}
