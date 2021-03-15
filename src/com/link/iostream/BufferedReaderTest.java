package com.link.iostream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
BufferedReader实例化对象时，需要传入一个Reader对象。
其中，传进去的Reader对象被称为“节点流”，外部包装的流称为“包装流”或“处理流”。
关闭资源时，只需要关闭“包装流”。 “节点流”会自动关闭。
*/

public class BufferedReaderTest {
	public static void main(String[] args) {

		String filePath = "./src/com/link/iostream/example.txt";
		FileReader reader = null;
		BufferedReader bufferedReader = null;

		try {
			reader = new FileReader(filePath);
			bufferedReader = new BufferedReader(reader);
			String line = null;

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
