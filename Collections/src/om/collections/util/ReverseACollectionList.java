package om.collections.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseACollectionList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Z");
		list.add("A");
		list.add("X");
		list.add("B");

		System.out.println("Before sorting"+list);
		Collections.reverse(list);
		System.out.println("After sorting"+list);
	}

}
