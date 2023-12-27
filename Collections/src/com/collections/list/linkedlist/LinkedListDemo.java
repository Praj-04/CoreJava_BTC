package com.collections.list.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		Object[] obj = new Object[1000000];
		for(int i=0;i<obj.length;i++) {
			obj[i]=new Object();
		}
		
		LinkedList<Object> list = new LinkedList();
		long start = System.currentTimeMillis();
		for(Object ob: obj) {
			list.add(ob);
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken"+(end-start));
	}

}
