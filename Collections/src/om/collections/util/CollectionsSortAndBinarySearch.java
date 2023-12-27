package om.collections.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortAndBinarySearch {

	public static void main(String[] args) {
List<String> list = new ArrayList<>();

list.add("Z");
list.add("A");
list.add("X");
list.add("B");

System.out.println("Before sorting"+list);
Collections.sort(list);
System.out.println("After sorting"+list);
Collections.sort(list,new MyComparator()); // descending order using comparator interface
System.out.println("After sorting using custom comparator"+list);

int result = Collections.binarySearch(list, "X"); // return index
System.out.println("Index is :" +result);


}

}
