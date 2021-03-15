package com.link.iostream;

import java.io.FileInputStream;
import java.io.IOException;

/*

*/

public class FileInputStreamTest {
	public static void main(String[] args) {

		String filePath = "./src/com/link/iostream/example.txt";
		FileInputStream fis = null;
		try {

			// 创建文件字节输入流对象
			fis = new FileInputStream(filePath);

			// 逐字节读取
//			int data = 0;
//			while((data = fis.read()) != -1) {
//				System.out.println(data);
//			}

			// 输入到byte数组
			byte[] bytes = new byte[1024];
			while (true) {
				int count = fis.read(bytes);
				if (count == -1)
					break;
				System.out.print(new String(bytes, 0, count));
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
