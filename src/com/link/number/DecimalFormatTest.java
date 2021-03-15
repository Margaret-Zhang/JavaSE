package com.link.number;

import java.text.DecimalFormat;

public class DecimalFormatTest {
	public static void main(String[] args) {
		// number -(format)-> String
		DecimalFormat df = new DecimalFormat("###,###.0000");
		String s1 = df.format(1234.56);
		System.out.println(s1); // 1,234.5600
		
		df = new DecimalFormat("####,###.####");
		String s2 = df.format(1234.56);
		System.out.println(s2); // 1,234.56
	}
}
