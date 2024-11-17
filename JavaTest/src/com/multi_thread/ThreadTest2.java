package com.multi_thread;


public class ThreadTest2 {

	public void nihao(){
		String a = "a";
		String b = "b";
		Thread t1 = new Thread(new MyThread(a,b));
		t1.start();
	}
	
	public static void main(String[] args) {
		ThreadTest2 thread = new ThreadTest2();
		thread.nihao();
		System.out.println(Thread.activeCount());
	}
}

class MyThread implements Runnable {
	
	private String a; 
	private String b;
	
	public MyThread(String a, String b){
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public void run() {
		System.out.println(a+b);
		for (int i = 0; i < 100; i++) {
			System.out.println(""+i);
			try {
			   new Thread().sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread.activeCount() : "+Thread.activeCount());
		}
	}

}