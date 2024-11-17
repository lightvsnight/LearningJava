package com.observer.example2;

import java.util.Observer;


/**
 * 
 * @author L.hk
 * 
 *  主题被观察者
 */
public class Test{
	
	
	public static void main(String[] args) {
		//被观察者
		SpecificWatchedRole swr = new SpecificWatchedRole();
		
		Observer  watcher1 = new SpecificWatcherRole1();
		Observer  watcher2 = new SpecificWatcherRole2();
		
		swr.addObserver(watcher1);
		swr.addObserver(watcher2);
		
		swr.counter(Integer.valueOf(01));
	}
}
