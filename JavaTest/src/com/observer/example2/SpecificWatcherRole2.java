package com.observer.example2;

import java.util.Observable;
import java.util.Observer;

public class SpecificWatcherRole2 implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(((Integer)arg).intValue() <= 5){
			System.out.println("SpecificWatcherRole2's count is: "+arg);
		}
	}
}
