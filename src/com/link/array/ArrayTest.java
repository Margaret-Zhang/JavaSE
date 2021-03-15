package com.link.array;

import java.util.Arrays;

/*
数组不属于基本数据类型，是引用数据类型。既可以存储基本数据类型的数据，也可以存储引用数据类型的对象。
数组都有一个length属性，记录数组的长度(元素个数)。
*/

public class ArrayTest {
	public static void main(String[] args) {

		// 数组的静态初始化
		int[] array1 = new int[] { 1, 3, 5, 7, 9 }; // <==> int[] array1 = {1, 3, 5, 7, 9};

		// 数组的动态初始化
		int[] array2 = new int[5];

		System.out.println(Arrays.toString(array1));
		System.out.println("array2 length = " + array2.length);
	}
}
