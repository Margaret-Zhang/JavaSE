package com.link.iostream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
使用FileReader和FileWriter完成单个文本文件的拷贝
*/

public class CopyTestII {
	public static void main(String[] args) {

		String srcFilePath = "./src/com/link/iostream/note.txt";
		String destFilePath = "E:/note.txt";
		FileReader reader = null;
		FileWriter writer = null;

		try {
			reader = new FileReader(srcFilePath);
			writer = new FileWriter(destFilePath);
			char[] chars = new char[16];

			while (true) {
				int count = reader.read(chars);
				if (count == -1)
					break;
				writer.write(chars, 0, count);
			}

			writer.flush();
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
