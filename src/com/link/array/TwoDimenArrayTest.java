package com.link.array;

/*
二维数组的每一个元素是一个一维数组。
*/

public class TwoDimenArrayTest {
	public static void main(String[] args) {
		// 二维数组
		int[][] array = new int[][] { { 0, 1, 2 },
									  { 3, 4, 5 },
									  { 5, 6, 7 } };

		for (int i = 0; i < array.length; ++i) {
			for (int j = 0; j < array[i].length; ++j) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
