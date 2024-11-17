package com.multi_thread;

public class ThreadTest4 {
     
	public static void main(String[] args) {
		Runnable r = new HelloThread();
	     Thread t1 = new Thread(r);
	     Thread t2 = new Thread(r);
	     
	     t1.start();
	     t2.start();
	}
}

class HelloThread implements Runnable {
	int i; //成员变量

	@Override
	public void run() {
		int i = 0; //局部变量
		while (true) {
			System.out.println("number :"+i++);
			try {
				Thread.sleep((long) (Math.random() * 1000)); //随机睡眠多少秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if (50 == i) {
				break;
			}
		}
	}
}
