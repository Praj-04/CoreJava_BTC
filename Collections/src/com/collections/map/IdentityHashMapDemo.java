package com.collections.map;

import java.util.Map;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
//		Map<Integer, String> map = new HashMap<>(); // if 2 keys are same even though created at 2 diff loaction..the
													// old key is replaced with new key value pair. here hashmap takes equals
		
		//With IdentityHAshMap, if the keys are same, they are created seperately and wont be replced. here it takes ==
		Map<Integer, String> map = new IdentityHashMap<>(); 

		Integer id1 = new Integer(10);
		Integer id2 = new Integer(10);

		map.put(id1, "Bharath");
		map.put(id2, "Sharath");

		System.out.println(map); // output will be only {10=Sharath}
		
		

	}

}
