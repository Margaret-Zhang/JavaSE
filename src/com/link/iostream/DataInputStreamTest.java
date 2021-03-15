package com.link.iostream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
从DataOutputStreamTest程序所写的文件中读取数据
读取的顺序需要与写入的顺序一样才能正常读取
*/

public class DataInputStreamTest {
	public static void main(String[] args) {

		String filePath = "E:/example";
		DataInputStream dis = null;

		try {
			dis = new DataInputStream(new FileInputStream(filePath));

			int i = dis.readInt();
			byte b = dis.readByte();
			char c = dis.readChar();
			boolean f = dis.readBoolean();

			System.out.println(i);
			System.out.println(b);
			System.out.println(c);
			System.out.println(f);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (dis != null) {
				try {
					dis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
