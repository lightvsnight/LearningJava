package com.observer.example2;

import java.util.Observable;
import java.util.Observer;


/**
 * 
 * @author L.hk
 * 具体观察者角色 
 */
public class SpecificWatcherRole1 implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("count is： "+arg);
	}

}
