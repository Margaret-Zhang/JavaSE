package com.link.reflect.bean;

public class Student {
	public int no;
	private String name;
	protected int age;
	boolean sex;

	public Student(int no, String name, int age, boolean sex) {
		this.no = no;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	
	public void study(int hour) {
		System.out.println("学习时长：" + hour + "小时");
	}
}
