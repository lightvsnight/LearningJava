package com.linkedList;

/**
 * 循环链表   测试
 * @author L.hk
 *
 */
public class Note1Test {

	public static void main(String[] args) {
		
		Note1  note1 = new Note1("note1");
		Note1  note2 = new Note1("note2");
		Note1  note3 = new Note1("note3");
		
		/*
		 *   |-------------------|
		 *                       V
		 * note1 --> note2 --> note3
		 * note1 <-- note2 <-- note3
		 *   ^                    
		 *   |--------------------|
		 *   
		 */
		
		note1.previous = note3;
		note3.previous = note2;
		note2.previous = note1;
		
		note1.next = note2;
		note2.next = note3;
		note3.next = note1;
		
		
		System.out.println("循环链表");
		System.out.println("--------------向上--------------");
		System.out.println(note1.previous.data);
		System.out.println(note1.previous.previous.previous.data);
		
		System.out.println("--------------向下--------------");
		System.out.println(note1.data);
		System.out.println(note1.next.next.next.data);
		
		
		System.out.println("==========================================");
		/*
		 *   |-------------------|
		 *                       V
		 * note1 --> note2 --> note3
		 * note1 <-- note2 <-- note3
		 *   ^                    
		 *   |--------------------|
		 *   
		 *  在note1 和 note2 之间 插入 note4
		 *   
		 */
		Note1 note4 = new Note1("note4");
		note1.next = note4;
		note4.previous = note1;
		
		note4.next = note2;
		note2.previous = note4;
		
		System.out.println("打印note4-->"+ note1.next.data);
		
		
		System.out.println("------------------------------------");
		/*
		 * 把 插入到循环链表中的 note4删掉 
		 */
		note1.next = note2;
		note2.previous = note1;
		
	
		note4.previous = null;
		note4.next = null;
		
		
		System.out.println("打印--note2："+note1.next.data);
	}
}
