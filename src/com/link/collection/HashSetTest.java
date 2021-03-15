package com.link.collection;

import java.util.HashSet;
import java.util.Set;

/*
HashSet集合存储元素的特点是无序不可重复
底层是创建了一个HashMap，并将元素都放在了HashMap的key部分
*/

public class HashSetTest {
	public static void main(String[] args) {
		Set<String> strs = new HashSet<>();
		
		strs.add("hello1");
		strs.add("hello2");
		strs.add("hello3");
		strs.add("hello4");
		
		for(String str : strs) {
			System.out.println(str);
		}
	}
}
