package com.link.iostream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/*
反序列化
*/

import com.link.iostream.bean.Student;

public class ObjectInputStreamTest {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		ObjectInputStream ois = null;

		try {
			ois = new ObjectInputStream(new FileInputStream("./src/com/link/iostream/students.txt"));

			students = (List<Student>) ois.readObject();
			for (Student s : students) {
				System.out.println(s);
			}

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
