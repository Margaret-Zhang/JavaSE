package com.link.arrays;

import java.util.Arrays;

public class BinarySearchTest {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 4, 8, 32, 128 };
		System.out.println(Arrays.binarySearch(array, 4));
		System.out.println(Arrays.binarySearch(array, 0)); // 返回的索引为-1代表不存在
	}
}
