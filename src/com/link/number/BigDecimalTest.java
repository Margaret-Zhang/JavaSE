package com.link.number;

import java.math.BigDecimal;

public class BigDecimalTest {
	public static void main(String[] args) {
		BigDecimal v1 = new BigDecimal(3.1415926535);
		BigDecimal v2 = new BigDecimal(2.7278122345);
		System.out.println(v1.add(v2)); // 调用add()方法求和
	}
}
