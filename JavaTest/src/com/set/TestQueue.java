package com.set;

import java.text.ParseException;
import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
	private static Queue<Object> queue = new LinkedList<Object>();

	public static void poll() {

		System.out.println(queue.poll());
	}

	public static void peek() throws ParseException {
		System.out.println(queue.peek());
	}

	public static boolean isEmpty() {

		return queue.isEmpty();
	}

	public static void main(String[] args) throws ParseException {
		queue.add(new Integer(1));
		peek();
		peek();
		System.out.println(queue.isEmpty());
	}
}
