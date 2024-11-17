package com.multi_thread.sample;

/**
 *  加法 线程
 * @author L.hk
 */
public class IncreaseThread extends Thread{

	private Sample sample;
	
	public IncreaseThread(Sample sample){
		this.sample  = sample;
	}
	
	@Override
	public void run() {
		for(int i = 0; i<20; i++){
			try {
				Thread.sleep((long)(Math.random()*10000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("thread-"+this.getName());
			sample.increase();
		}
	}
}
