package com.link.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
java.util.Collections是集合工具类
*/

public class CollectionsTest {
	public static void main(String[] args) {
		// ArrayList集合不是线程安全的
		List<String> list = new ArrayList<>();
		// 把ArrayList变成线程安全的
		Collections.synchronizedList(list);

		// 排序
		list.add("abf");
		list.add("abd");
		list.add("abc");
		Collections.sort(list);

		for (String s : list) {
			System.out.println(s);
		}
	}
}
