package com.link.collection;

import java.util.Set;
import java.util.TreeSet;

/*
TreeSet集合存储元素的特点是无序不可重复，存储的元素自动按照大小顺序排序
*/

public class TreeSetTest {
	public static void main(String[] args) {
		Set<String> strs = new TreeSet<>();
		
		strs.add("MACOS");
		strs.add("WINDOWS");
		strs.add("GNU/LINUX");
		
		for(String str : strs) {
			System.out.println(str);
		}
	}
}
