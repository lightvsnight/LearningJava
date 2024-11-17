package com.set;

import java.util.HashSet;

public class HashSetTest2 {

	public static void main(String[] args) {
		 
		HashSet<Object> set = new HashSet<Object>();
		
		Student s = new Student("zhangsan");
		Student s1 = new Student("zhangsan");
		set.add(s);
		set.add(s1);
		
		System.out.println(set);
		
	}
}

class Student {

	String name;

	public Student(String name) {
		this.name = name;
	}

	// eclipse 自动实现 hashCode方法和equals 方法的重写
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	

	/*
	 * 当我们添加两个对象时，如果两个对象的值相同我们不在添加
	 * 重写hashcode方法
	 */
	/*public int hashCode(){
		return this.name.hashCode();
	}
	
	 
	 * 当我们添加两个对象时，如果两个对象的值相同我们不在添加
	 * 重写equals方法
	 
	public boolean equals(Object obj){
		
		if(this == obj){
			return true;
		}
		if(null!=obj && obj instanceof Student){
			Student stu  = (Student)obj;
			if(name.equals(stu.name)){
				return true;
			}
		}
		
		return false;
	}*/
	
	public String toString(){
		return this.name;
	}
}