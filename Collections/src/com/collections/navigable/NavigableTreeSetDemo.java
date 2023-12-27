package com.collections.navigable;

import java.util.TreeSet;

public class NavigableTreeSetDemo {

	public static void main(String[] args) {

		TreeSet<Integer> t = new TreeSet<>();
		for(int i =10;i<=50;i+=10) {
			t.add(i);
		}
		System.out.println(t);
		System.out.println(t.ceiling(29));  // equal or greater than
		System.out.println(t.higher(30));  //greater than
		System.out.println(t.floor(20)); //equal  or less than
		System.out.println(t.lower(20)); //lower than
		System.out.println(t.tailSet(20));		// number specified in tailset is inclusive
		System.out.println(t.tailSet(30, false)); // excluding the no specified by making it false
		System.out.println(t.headSet(30)); // number specified is exclusive
		System.out.println(t.headSet(30, true)); //including the no by making the boolean value true
		System.out.println(t.pollFirst()); // removes and returns first element
		System.out.println(t.pollLast());// removes and returns last element
		System.out.println(t.descendingSet()); // returns in descending order, by default return ascending order
		System.out.println(t);
	}

}
