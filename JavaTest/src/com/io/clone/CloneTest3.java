package com.io.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CloneTest3 {
	
	public static void main(String[] args) throws Exception {
		Teacher3  t3 = new Teacher3();
		t3.setName("Teacher li");
		t3.setAge(27);
		
		Student3 s1 = new Student3();
		s1.setName("zhangsan");
		s1.setAge(20);
		s1.setTeacher(t3);
		
		Student3 s2 = (Student3) s1.deepCopy();
		
		System.out.println(s2.getAge());
		System.out.println(s2.getName());
		
		
		System.out.println("-------------------------");
		
		System.out.println("age:"+s2.getTeacher().getAge()+" name:"+s2.getTeacher().getName());
		
		System.out.println("-------------------------");
		s2.getTeacher().setAge(30);
		s2.getTeacher().setName("Teacher Qian");
		
		System.out.println("age:"+s1.getTeacher().getAge()+" name:"+s1.getTeacher().getName());
		System.out.println("age:"+s2.getTeacher().getAge()+" name:"+s2.getTeacher().getName());
	}
}

class Teacher3 implements Serializable {

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
}

class Student3 implements Serializable {
	
	private int age;
	private String name;
	private Teacher3 teacher;

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

	public Teacher3 getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher3 teacher) {
		this.teacher = teacher;
	}

	/**
	 * Éî¿½±´
	 * @return
	 * @throws Exception
	 */
	public Object deepCopy() throws Exception {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
	}
}