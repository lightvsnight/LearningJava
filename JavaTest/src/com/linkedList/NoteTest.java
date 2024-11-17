package com.linkedList;


/**
 * 单向链表
 * @author L.hk
 *
 */
public class NoteTest {
	public static void main(String[] args) {
		Note note1 = new Note("note1");
		Note note2 = new Note("note2");
		Note note3 = new Note("note3");
		
		System.out.println("单向链接   demo");
		/*
		 * 单向链接  demo
		 * note1-->note2-->note3
		 */
		note1.next = note2;
		note2.next = note3;
		
		System.out.println("note1-->note2-->note3");
		System.out.println(note1.next.next.data);
		
		System.out.println("------------------------");
		
		
		/*
		 * 单向链接   demo
		 * note1-->note4-->note2-->note3
		 */
		Note note4 = new Note("note4");
		note1.next = note4;
		note4.next = note2;
		System.out.println("note1-->note4-->note2-->note3");
		System.out.println(note1.next.next.next.data);
		
		
		/*
		 * 单向链接  demo
		 *  删除 note4,指向note3
		 *  note1-->note4-->note2-->note3
		 */
		note1.next = note2;
		note4.next = null;
		
		System.out.println("删除 note4");
		System.out.println("note1-->note2-->note3");
		System.out.println(note1.next.data);
		System.out.println(note1.next.next.data);
		System.out.println(note1.next.next.next);
	}
}
