package com.multi_thread.sample;


/**
 * 
 * @author L.hk
 * 0,1交替输出
 */
public class Sample {

	private int number;
	
	public synchronized void increase(){
		//while(0 != number){
		if(0 != number){
			try {
				wait(); //当前对象
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		number++;
		System.out.println(number);
		notify();
	}
	
	public synchronized void decrease(){
		
		if(0 == number){
		//while(0 == number){// 等于0,number还没有变为1
			try {
				wait(); //当前对象
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		number--;
		System.out.println(number);
		notify();
	}
}
