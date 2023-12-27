package com.arrays.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeArrays {

	public static void main(String[] args) {
String[] s1 = {"A","B","C","D"};		

String[] s2 = {"H","I","J","K"};

List<String> list = new ArrayList<>(Arrays.asList(s1));
list.addAll(Arrays.asList(s2));

Object[] array = list.toArray();
System.out.println(Arrays.toString(array));

	}

}
