package com.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		for (int i = 10; i <= 100; i += 10) {
			list.add(i);
		}
System.out.println("list :" +list);

list.add(2, 200);
System.out.println("list after insert at index 2 :" +list);

list.set(3, 300);
System.out.println("list after replacement at index 3 :" +list);

List<Integer> list2 = new ArrayList<>();
list2.add(222);
list2.add(333);
list2.add(444);
list2.add(555);
list2.add(666);
list.addAll(4, list2);
System.out.println(list);



if(list.contains(222)) {
	System.out.println("has value");
}else {
	
	System.out.println("doesnot have value");
}

for(int i=0;i<list.size();i++) {
	System.out.println(list.get(i));

}
System.out.println(list.remove(3));
System.out.println(list);

	}

}
