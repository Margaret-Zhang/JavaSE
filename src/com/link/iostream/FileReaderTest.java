package com.link.iostream;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) {

		String filePath = "./src/com/link/iostream/note.txt";
		FileReader reader = null;

		try {
			// 创建一个文件字符流对象
			reader = new FileReader(filePath);

			// 读取到char数组
			char[] chars = new char[16];
			while (true) {
				int count = reader.read(chars);
				if (count == -1)
					break;
				System.out.print(new String(chars, 0, count));
			}

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
