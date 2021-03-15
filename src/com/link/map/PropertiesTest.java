package com.link.map;

import java.util.Properties;

/*
1. Properties是一个Map集合，继承Hashtable
2. Properties的key和value都是String类型
3. Properties线程安全
*/

public class PropertiesTest {
	public static void main(String[] args) {
		Properties pro = new Properties();
		// 存储方法
		pro.setProperty("url", "https://localhost:3306/bjpowernode");
		pro.setProperty("driver", "com.mysql.jdbc.Driver");
		pro.setProperty("username", "root");
		pro.setProperty("password", "123");

		// 通过key获取value
		System.out.println("url: " + pro.getProperty("url"));
		System.out.println("driver: " + pro.getProperty("driver"));
		System.out.println("username: " + pro.getProperty("username"));
		System.out.println("password: " + pro.getProperty("password"));
	}
}
