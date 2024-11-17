package com.observer.example1;

/**
 * 
 * @author L.hk
 *  抽象主题角色： 把所有对观察者对象的引用保存在一个集合中，每个抽象主题角色都可以有任意数量的观察者。
 *               抽象主题提供一个接口，可以增加和删除观察者角色。 一般用一个抽象类或接口实现。
 */
public interface Watched {
	
	/*增加一个观察者*/
	public void addWatcher(Watcher watcher);

	/*删除一个观察者*/
	public void removeWatcher(Watcher watcher);

	/*通知观察者*/
	public void notifyWatchers(String str);
	
	
}
