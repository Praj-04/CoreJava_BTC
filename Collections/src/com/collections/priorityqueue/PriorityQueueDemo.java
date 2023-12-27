package com.collections.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<>();

		System.out.println(q.peek()); // return the last element, if no elements returns null;
//System.out.println(q.element()); // return the last element, if no elements returns NoSuchElementException

		
		// adding elements - when you print first time the elements will be displayed in
		// natural sorting order, but if you manipulate(add/remove) then no guarantee it
		// will be in sorted order
		for (int i = 20; i <= 30; i++) {
			q.offer(i);
		}
		System.out.println(q);
		
		System.out.println(q.poll());
		System.out.println(q.remove());
		
		System.out.println(q);
	}

}
