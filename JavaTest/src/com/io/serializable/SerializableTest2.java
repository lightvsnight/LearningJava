package com.io.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 序列化 代码讲解
 */
public class SerializableTest2 {

	public static void main(String[] args) throws Exception {

		Student p1 = new Student(1, "小李", 24, 1.75);
		Student p2 = new Student(2, "小王", 25, 1.86);
		Student p3 = new Student(3, "小张", 23, 1.91);
		Student p4 = new Student(4, "小赵", 27, 1.69);

		FileOutputStream fos = new FileOutputStream("Student.tmp");

		/**
		 * 开始序列化Student对象 ObjectOutputStream
		 */

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.writeObject(p3);
		oos.writeObject(p4);

		oos.close(); // 关闭流

		/**
		 * 读取被序列化的对象
		 */
		FileInputStream fis = new FileInputStream("Student.tmp");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student result1 = (Student) ois.readObject();
		System.out.println(result1.toString());

		Student result2 = (Student) ois.readObject();
		System.out.println(result2.toString());

		Student result3 = (Student) ois.readObject();
		System.out.println(result3.toString());

		Student result4 = (Student) ois.readObject();
		System.out.println(result4.toString());

		Student result5 = (Student) ois.readObject();
		System.out.println(result5.toString());

		ois.close();
	}

}

class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	int id;
	String name;
	int age;
	double height;

	Student(int id, String name, int age, double height) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public String toString() {
		return "id:" + this.id + " ,name:" + this.name + " ,age:" + this.age
				+ " ,height:" + this.height;
	}

	
	/**
	 * 该方法在对象被序列化后，类被加载时自动会调用序列化非静态变量
	 * @param out
	 * @throws IOException
	 */
	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		out.writeInt(this.id);
		out.writeInt(this.age);
		out.writeUTF(this.name);
		out.writeDouble(this.height);
		System.out.println("writer Object");
	}
	/**
	 * 该方法在对象被序列化后，类被加载时自动会调用序列化非静态变量
	 * @param in
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	private void readObject(java.io.ObjectInputStream in) throws IOException,
			ClassNotFoundException {
		this.id = in.readInt();
		this.age = in.readInt();
		this.name = in.readUTF();
		this.height = in.readDouble();
		System.out.println("read Object");
	}

}