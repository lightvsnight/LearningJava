package com.io.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *  序列化 代码讲解
 */
public class SerializableTest {
	
	public static void main(String[] args) throws Exception {
		
		Person p1 = new Person(1,"小李",24,1.75);
		Person p2 = new Person(2,"小王",25,1.86);
		Person p3 = new Person(3,"小张",23,1.91);
		Person p4 = new Person(4,"小赵",27,1.69);
		
		
		FileOutputStream fos = new FileOutputStream("person.tmp");
		
		/**
		 * 开始序列化person对象
		 * ObjectOutputStream
		 */
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.writeObject(p3);
		oos.writeObject(p4);
		
		oos.close(); //关闭流
		
		/**
		 * 读取被序列化的对象
		 */
		FileInputStream fis = new FileInputStream("person.tmp");
		ObjectInputStream ois = new ObjectInputStream(fis);
		 Person result1  = (Person)ois.readObject();
		 System.out.println(result1.toString());
		 
		 Person result2  = (Person)ois.readObject();
		 System.out.println(result2.toString());
		 
		 Person result3  = (Person)ois.readObject();
		 System.out.println(result3.toString());
		 
		 Person result4  = (Person)ois.readObject();
		 System.out.println(result4.toString());
		 
		 Person result5  = (Person)ois.readObject();
		 System.out.println(result5.toString());
		
		 ois.close();
	}

}


class Person implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	int id;
	String name;
	int age;
	double height;
	
	Person(int id, String name, int age, double height){
		this.id = id;
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public String toString(){
		return "id:"+this.id+" ,name:"+this.name+" ,age:"+this.age+" ,height:"+this.height;
	}
}