package com.link.iostream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.link.iostream.bean.Student;

/*
序列化
*/

public class ObjectOutputStreamTest {
	public static void main(String[] args) {
		// 创建java对象
		List<Student> students = new ArrayList<>();
		students.add(new Student(1111, "zhangsan"));
		students.add(new Student(2222, "lisi"));
		students.add(new Student(3333, "wangwu"));

		ObjectOutputStream oos = null;

		try {
			// 序列化对象
			oos = new ObjectOutputStream(new FileOutputStream("./src/com/link/iostream/students.txt"));

			// 序列化
			oos.writeObject(students);

			oos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
