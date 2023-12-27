package com.demo.arrays;

import java.util.Arrays;

public class FiveWithZero {

	public static void main(String[] args) {
		int a[] = { 2, 7, 3, 5, 7, 5, 0, 3, 5 };

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 3 && a[i + 1] == 5) {
				
					a[i + 1] = 0;
				
			}
		}
		System.out.println(Arrays.toString(a));
//		for(int j:a) {
//			System.out.println(j);
//		}

	}

}
