package com.link.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
1. Map集合与Collection集合没有继承关系
2. Map集合以key和value的方式存储数据：键值对
	key和value都是引用数据类型
	key和value都是存储对象的内存地址
	key起主导地位，value是key的一个附属品
3. Map集合中常用的方法：
	V put(K key, V value) 向集合添加键值对
	V get(K key) 由key得到value
	V remove(Object key) 根据key删除键值对
	Set<K> keySet() 获取集合所有的key集合，返回一个Set集合
	Collection<V> values() 获取所有的value，返回一个Collection集合
	Set<Map.Entry<K, V>> entrySet() 将Map集合转换成Set集合
*/

public class MapTest {
	public static void main(String[] args) {
		// 创建Map集合对象
		Map<Integer, String> map = new HashMap<>();
		// 添加键值对
		map.put(1, "黄药师");
		map.put(2, "欧阳锋");
		map.put(3, "段智兴");
		map.put(4, "洪七公");
		System.out.println("Map集合中键值对的个数：" + map.size());

		// 判断是否包含key和value
		System.out.println("是否包含key:1? " + (map.containsKey(1) ? "包含" : "不包含"));
		System.out.println("是否包含value:洪七公? " + (map.containsValue("洪七公") ? "包含" : "不包含"));

		// 获取所有的key
		Set<Integer> keys = map.keySet();
		for (Integer i : keys) {
			System.out.println(i);
		}

		// 获取所有的value
		Collection<String> values = map.values();
		for (String s : values) {
			System.out.println(s);
		}

		// 通过key的Set集合获取所有的value
		Iterator<Integer> it = keys.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			System.out.println(map.get(i));
		}

		// 将Map集合转换成Set集合
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		for (Map.Entry<Integer, String> node : set) {
			System.out.println(node.getKey() + "-->" + node.getValue());
		}

		System.out.println(map);
	}
}
