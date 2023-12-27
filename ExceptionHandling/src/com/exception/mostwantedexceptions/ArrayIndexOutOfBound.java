package com.exception.mostwantedexceptions;

public class ArrayIndexOutOfBound {

	public static void main(String[] args) {
		int[] a=new int[20];
		System.out.println(a[0]);
		System.out.println(a[a.length-1]);
	}
}
