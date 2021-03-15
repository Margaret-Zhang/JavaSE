package com.link.map;

import java.util.Hashtable;
import java.util.Map;

/*
1. HashMap的key和value都能为null
2. Hashtable的key和value都不能为null
3. Hashtable方法是线程安全的
*/

public class HashtableTest {
	public static void main(String[] args) {
		Map<Object, Object> map = new Hashtable<>();
//		map.put(null, "123"); // java.lang.NullPointerException
		map.put("123", null); // java.lang.NullPointerException
	}
}
