package com.io.clone;

public class CloneTest1 {
	
	public static void main(String[] args) throws Exception {
		Student t1 = new Student();
		t1.setAge(20);
		t1.setName("zhangsan");
		Student t2 = (Student)t1.clone();
				
		System.out.println("t1: age:"+t1.getAge()+" name:"+t1.getName());
		System.out.println("t2: age:"+t2.getAge()+" name:"+t2.getName());
		
		t2.setName("lisi");
		System.out.println("t1: age:"+t1.getAge()+" name:"+t1.getName());
		System.out.println("t2: age:"+t2.getAge()+" name:"+t2.getName());
		
	}

}

class Student implements Cloneable {

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
	
	/**
	 * 重写Object的clone() 方法。
	 * clone() 克隆：克隆当前对象
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object object = super.clone();
		return object;
	}

}