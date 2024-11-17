package com.io.clone;

public class CloneTest2 {

	public static void main(String[] args) throws Exception {
		Teacher teacher = new Teacher();
		teacher.setAge(30);
		teacher.setName("Teacher Li");

		Student2 s1 = new Student2();
		s1.setAge(20);
		s1.setName("张三");
		s1.setTeacher(teacher);

		Student2 s2 = (Student2) s1.clone();
		s2.setAge(20);
		s2.setName("小李");

		teacher.setAge(40);
		teacher.setName("Teacher zhao");

		System.out.println("s1: name:" + s1.getName() + ", age:" + s1.getAge());
		System.out.println("s1的老师:" + ": name:" + s1.getTeacher().getName()
				+ " , age:" + s1.getTeacher().getAge());

		System.out.println("s2: name:" + s2.getName() + ", age:" + s2.getAge());
		System.out.println("s2的老师:" + ":  name:" + s2.getTeacher().getName()
				+ " , age:" + s2.getTeacher().getAge());

	}

}

class Teacher implements Cloneable {

	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}

class Student2 implements Cloneable {

	private int age;
	private String name;
	private Teacher teacher;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		
		// Object object = super.clone();
		// return object;
		
		Student2 s2 = (Student2) super.clone();
		s2.setTeacher((Teacher) s2.getTeacher().clone());
		return s2;
	}

}