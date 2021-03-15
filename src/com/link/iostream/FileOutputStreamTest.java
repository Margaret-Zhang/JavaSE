package com.link.iostream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
	public static void main(String[] args) {

		String filePath = "./src/com/link/iostream/example.txt";
		FileOutputStream fos = null;

		try {
			// 创建一个文件字节输出流，文件不存在时则新建
			fos = new FileOutputStream(filePath, true);

			// 向文件中写数据
			byte[] bytes = new byte[] { '\n', 'W', 'o', 'r', 'l', 'd' };
			fos.write(bytes);

			// 写完后刷新
			fos.flush();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}