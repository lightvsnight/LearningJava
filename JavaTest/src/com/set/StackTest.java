package com.set;

import java.util.LinkedList;

/**
 * 
 * @author L.hk
 *
 *         栈(stack):先进后出，后进先出
 * 
 *         无论是栈还是队列，里面都会维护一个成员变量，该成员变量用于存储栈或队列中的元素。 该成员变量请使用LinkedList类型。
 */
public class StackTest {

	private final LinkedList<Object> list = new LinkedList<Object>();

	// 将对象压入栈中
	public void push(Object o) {

		list.addLast(o);
	}

	// 把对象从栈中弹出来，栈里面就不存在这个对象了
	public Object pop() {
		return list.removeLast();
	}

	// 查看当前栈中的元素，获取元素本身，但是不把它从栈里弹出来，元素本身还在栈里，只是把它的值拿出来
	public Object peek() {
		return list.getLast();
	}

	// 判断栈是否为空
	public boolean isEmpty() {
		return list.isEmpty();
	}

	public static void main(String[] args) {

		StackTest stack = new StackTest();
		stack.push("one");
		stack.push("two");
		stack.push("three");

		System.out.println(stack.peek());  //stack.peek() 取栈中排在最后的元素，不删除
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		
		System.out.println(stack.pop());  //stack.pop() 取出栈中最后的元素，并删除
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println(stack.isEmpty());
	}
}
