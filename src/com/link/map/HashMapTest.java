package com.link.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
HashMap集合
1. HashMap集合底层是哈希表/散列表的数据结构

2. 哈希表的数据结构是数组和单向链表的结合体
	数组：在查询方面效率很高，但在随机增删方面效率低
	链表：在随机增删方面效率很高，但在查询方面效率很低
	哈希表将以上两种数据结构融合在一起，充分大会它们各自的优点

3. HashMap.put(k, v)实现原理
	第一步：先将k，v封装到Node对象中
	第二步：底层调用k的hashCode()方法得出hash值，然后通过哈希函数/哈希算法
	将hash值转换成数组的下标。下标位置上如果没有元素，就把Node对象添加到这个位置上；
	如果下标位置有链表，此时会拿着key和链表上每一个节点的k进行equals，如果所有的
	equals返回都是false，新节点会被放到链表的末尾，如果equals返回true，则新
	节点的v会覆盖旧节点的v。

4. v HashMap.get(k)实现原理
	第一步：调用k的hashCode()方法得到哈希值，通过哈希算法将哈希值算出数组下标
	第二步：如果下标位置无键值对，返回null；如果有键值对，就拿着k与链表上每一个节点
	进行equals，返回true的节点就是要找的节点，最后返回节点的v。

5. 重要：存放在HashMap集合中的key元素(或HashSet元素)需要重写equals()和hashCode()

6. HashMap集合的默认初始化容量是16，默认加载因子是0.75(数组元素达到75%开始扩容)

7. HashMap集合的key可以是null
*/

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1111, "zhangsan");
		map.put(6666, "lisi");
		map.put(4444, "wangwu");
		map.put(7777, "zhaoliu");
		map.put(7777, "king");
		System.out.println("HashMap集合键值对的个数：" + map.size());

		// 遍历HashMap集合
		Set<Map.Entry<Integer, String>> entry = map.entrySet();
		for (Map.Entry<Integer, String> node : entry) {
			System.out.println(node.getKey() + "-->" + node.getValue());
		}
		
		map.put(null, null);
		map.put(null, "100");
		System.out.println(map.get(null)); // 100
	}
}
