package com.io.charset;

import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.RandomAccessFile;

/**
 * 
 *  随机访问文件类
 *  RandomAccessFile(File fileObj,String access) throws FileNotFoundException
 *    fileObj 指定了作为File 对象打开的文件名称
 *  
 *  RandomAccessFile(String fileName, String access) throws FileNotFoundException
 *    文件名是由fileName参数传入的。
 *    
 *  两种情况下， access 都决定允许访问何种文件类型。
 *    如果是 “r”,那么文件可读不可写，如果是 “rw”,文件已读写模式打开。
 *    例如： new RandomAccessFile("hello.txt", "r");
 *         new RandomAccessFile("hello.txt", "rw");
 *         
 *         
 *   RandomAccessFile implements DataOutput, DataInput, Closeable
 *   所以既能读，也能写
 *
 */
public class RandomAccessFileTest {
	
	public static void main(String[] args) throws Exception {
		Person person = new Person(1,"xiaoxiao",1.72);
		
		RandomAccessFile raf = new RandomAccessFile("hello.txt","rw");
		person.write(raf);
		
		Person p = new Person();
		
		/**
		 * 如果没有调用raf.seek(long pos);方法，就会抛出 java.io.EOFExcepion异常
		 * 这个异常是因为RandomAccessFile是一个随机访问的，当它写完之后，光标指向已经到达文件的末尾
		 * 所以在使用raf写入后，如果马上读取，需要将光标指向重新指向开始。
		 */
		raf.seek(0); // 让读的位置重新回到文件开头
		p.read(raf);
		System.out.println(p.toString());
	}

}

 
class Person{
	int id;
	String name;
	double height;
	
	public Person(){
		
	}
	
	public Person(int id, String name, double height){
		this.id  = id;
		this.name = name;
		this.height = height;
	}
	
	public void write(RandomAccessFile raf) throws Exception{
		raf.writeInt(this.id);
		raf.writeUTF(this.name);
		raf.writeDouble(this.height);
	}
	
	public void read(RandomAccessFile raf) throws Exception{
		this.id = raf.readInt();
		this.name = raf.readUTF();
		this.height = raf.readDouble();
	}
	
	public String toString(){
		return "id:"+this.id+", name:"+this.name+", height:"+this.height;
	}
}