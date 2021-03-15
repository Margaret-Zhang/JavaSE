package com.link.iostream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
java.io.DataOutputStream：数据专属流
该流能将数据连同类型存储到文件中，非文本文件
*/

public class DataOutputStreamTest {
	public static void main(String[] args) {

		String filePath = "E:/example";
		DataOutputStream dos = null;

		try {
			// 创建数据专属的字节输出流
			dos = new DataOutputStream(new FileOutputStream(filePath));

			int i = 100;
			byte b = 10;
			char c = 'A';
			boolean f = true;
			// 写数据
			dos.writeInt(i);
			dos.writeByte(b);
			dos.writeChar(c);
			dos.writeBoolean(f);

			dos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (dos != null) {
				try {
					dos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
