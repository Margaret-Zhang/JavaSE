package com.link.iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
使用FileInputStream和FileOutputStream完成单个文件的拷贝
*/

public class CopyTestI {
	public static void main(String[] args) {

		String srcFilePath = "./src/com/link/iostream/note.txt";
		String destFilePath = "E:/note.txt";
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream(srcFilePath);
			fos = new FileOutputStream(destFilePath);
			byte[] bytes = new byte[16];

			while (true) {
				int count = fis.read(bytes);
				if (count == -1)
					break;
				fos.write(bytes, 0, count);
			}

			fos.flush();
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
