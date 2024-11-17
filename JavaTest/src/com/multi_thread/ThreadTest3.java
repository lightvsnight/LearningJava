package com.multi_thread;

public class ThreadTest3 implements Runnable {
	private boolean flag = true;
	public void run() {
		while (flag) {
			// ...
		}
	}
	public void stopRunning() {
		this.flag = false;
	}
}
class ControlThread {
	private Runnable r = new com.multi_thread.ThreadTest3();
	private Thread t = new Thread(r);
	public void startThread() {
		t.start();
	}
	public void stopThread() {
		((ThreadTest3) r).stopRunning();
	}
}
