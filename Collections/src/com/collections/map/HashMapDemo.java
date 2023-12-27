package com.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		map.put("Prajna", 90);
		map.put("Adi", 99);
		map.put("Prajwal", 100);
		
		Set<String> keySet = map.keySet();
		System.out.println(keySet);
		
		Collection<Integer> values = map.values();
		System.out.println(values);
	}

}
