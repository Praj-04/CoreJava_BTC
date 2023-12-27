package com.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;


public class DifferetSets {

	public static void main(String[] args) {
		Random obj = new Random();

//		HashSet<Integer> hs = new HashSet<>();  //random order
//		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();  //ordere in which its entered
		Set<Integer> s = new TreeSet<>();		//sorted order
		

		for (int i = 1; i <= 5; i++) {
			int number = obj.nextInt(100);
//			hs.add(number);
//			lhs.add(number);
			s.add(number);
			System.out.print(number+" ,");
		}
		System.out.println();
//		System.out.println("Hashset numbers are :"+hs);  
//		System.out.println("Linked Hashset numbers are :"+lhs);
		System.out.println("Treeset numbers are :"+s);
		
		Iterator<Integer> i = s.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
			i.remove();
		}
		System.out.println("set values are"+s );

	}

}
