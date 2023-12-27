package com.arrays.util;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
int[] a = {40,10,15,7	};

System.out.println(Arrays.toString(a));
Arrays.sort(a);

System.out.println(Arrays.toString(a));	

	String[] s = {"V","A","Z","D"};
	
	Arrays.sort(s,new MyComparator());

	System.out.println(Arrays.toString(s));
	
	
	
	}

}
