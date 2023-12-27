package com.arrays.util;

import java.util.Arrays;
import java.util.Collections;

public class MinMax {

	public static void main(String[] args) {
		Integer[] numbers = { 100, -5, 20, 400 };

		Integer max = Collections.max(Arrays.asList(numbers));

		Integer min = Collections.min(Arrays.asList(numbers));

		System.out.println(max);
		System.out.println(min);
	}

}
