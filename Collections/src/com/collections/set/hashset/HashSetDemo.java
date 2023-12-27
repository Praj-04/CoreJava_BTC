package com.collections.set.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Random obj = new Random();

		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {

			list.add(obj.nextInt(5));

		}
		System.out.println(list);
		
		Set<Integer> s = new HashSet<>(list);
//	s.addAll(list);
		System.out.println(s);

	}

}
