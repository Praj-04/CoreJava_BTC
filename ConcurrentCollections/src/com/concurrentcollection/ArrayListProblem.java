package com.concurrentcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListProblem {

	public static void main(String[] args) {

		CopyOnWriteArrayList<String> courses = new CopyOnWriteArrayList<>();
		courses.add("Java");
		courses.add("Python");
		courses.add("AWS");
		courses.add("Docker");
		
		Iterator<String> i = courses.iterator();
		
	while(i.hasNext()){
			String course=i.next();
			System.out.println(course);
			if(course.equals("AWS")) {
				courses.remove(course);
			}
			
			courses.add("Node");
		}
		System.out.println(courses);
		
	}

}
