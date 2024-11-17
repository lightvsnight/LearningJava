package com.linkedList;


/**
 * 单向链表
 * @author L.hk
 *
 */
public class Note {
	
	public Object data;  //存放节点数据本身
	public Note next;    //存放指向下一个节点的引用
	
	public Note(Object data){
		this.data =  data;
	}
	
	public String toString(){
		return this.data.toString();
	}
}
