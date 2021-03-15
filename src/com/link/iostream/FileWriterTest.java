package com.link.iostream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) {

		String filePath = "./src/com/link/iostream/example.txt";
		FileWriter writer = null;

		try {
			writer = new FileWriter(filePath, true);

			// 向文件中写入数据
			char[] chars = new char[] { '\n', 'W', 'o', 'r', 'l', 'd' };
			writer.write(chars);
			
			char ch = '!';
			writer.write(ch);

			String str = "\n田晓霞";
			writer.write(str, 0, str.length());

			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
