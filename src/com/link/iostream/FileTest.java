package com.link.iostream;

import java.io.File;
import java.text.SimpleDateFormat;
//import java.io.IOException;

/*
File类与IO四大家族无关，File类不能完成文件的读和写
*/

public class FileTest {
	public static void main(String[] args) {

		String filePath = "E:/example.txt";
		File file = new File(filePath);

		System.out.println(filePath + "是否存在? " + (file.exists() ? "存在" : "不存在"));
		if (!file.exists()) {
			// 如果不存在，以文件形式创建
//			try {
//				file.createNewFile();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}

			// 如果不存在，以目录形式创建
//			file.mkdir();
//			file.mkdirs(); // 多重目录
		}

		filePath = "./src/com/link/iostream/example.txt";
		file = new File(filePath);
		System.out.println(filePath + "的绝对路径是：" + file.getAbsolutePath());

		System.out.println(filePath + "是否为目录? " + (file.isDirectory() ? "是" : "不是"));
		System.out.println(filePath + "是否为文件? " + (file.isFile() ? "是" : "不是"));

		long lastTime = file.lastModified();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String strTime = sdf.format(lastTime);
		System.out.println(filePath + "最后一次修改时间是：" + strTime);

		// 获取当前路径下所有的文件和目录
		filePath = ".";
		file = new File(filePath);
		File[] files = file.listFiles();
		for (File f : files) {
			System.out.println(f.getName());
		}
	}
}
