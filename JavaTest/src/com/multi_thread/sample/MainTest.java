package com.multi_thread.sample;

public class MainTest {

	public static void main(String[] args) {
		Sample sample = new Sample();
		
		Thread t_0 = new IncreaseThread(sample);
		Thread t_1 = new DecreaseThread(sample);
		//Thread t_2 = new DecreaseThread(sample);
		
		//Thread it1 = new IncreaseThread(sample);
		//Thread dt1 = new DecreaseThread(sample);
		
		t_0.start();
		t_1.start();
		//t_2.start();
		
		//it1.start();
		//dt1.start();
	}
}
