package com.link.iostream;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
IO和Properties的联合使用
修改信息时不需要改动java程序，只需要修改配置文件
配置文件的格式：key=value，属性配置文件，建议以.properties结尾，但不是必须的
*/

public class IOPropertiesTest {
	public static void main(String[] args) {
		Properties pro = new Properties();
		String filePath = "./src/com/link/iostream/userinfo.properties";
		FileReader reader = null;

		try {
			reader = new FileReader(filePath);

			// 将字符输入流加载到Map集合
			pro.load(reader);

			// 通过key获取value
			String username = pro.getProperty("username");
			String password = pro.getProperty("password");
			System.out.println(username);
			System.out.println(password);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
