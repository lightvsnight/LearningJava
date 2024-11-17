package com.set;

import java.util.LinkedList;

/**
 * 
 * @author L.hk
 *
 *         队列(Queue)：先进先出，后进后出 无论是栈还是队列，里面都会维护一个成员变量，该成员变量用于存储栈或队列中的元素。
 *         该成员变量请使用LinkedList类型。
 */
public class QueueTest {

	private static final LinkedList<Object> list = new LinkedList<Object>();
	
	public QueueTest() {
	}

	/**
	 * 保证当前类只有一个实例
	 * 
	 * @param queue
	 * @return
	 */
	public static QueueTest getInstance(QueueTest queue) {
		System.out.println(queue instanceof QueueTest);
		if (queue == null && queue instanceof QueueTest) {
			queue = new QueueTest();
			return queue;
		}
		return queue;
	}

	// 将元素放入到队列里面
	public void put(Object o) {
		list.addLast(o);
	}

	// 将队列里面的对象取出来
	public Object get() {
		return list.removeFirst();
	}

	// 判断当前队列是否为空
	public boolean isEmpty() {
		return list.isEmpty();
	}

	public static void main(String[] args) {

		QueueTest queue = new QueueTest();
		queue.put("one");
		queue.put("two");
		queue.put("three");

		System.out.println(queue.get()); //queue.get() 取出队列中下标靠前的元素
		System.out.println(queue.get());
		System.out.println(queue.get());
		
		
		System.out.println(queue.isEmpty());
	}
}
