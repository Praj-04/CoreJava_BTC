package com.demo.string.methods;

public class StringMethodsDemo {

	public static void main(String[] args) {
		String s = "Hello There";

		
		System.out.println("Length of string is :"+s.length() );

		System.out.println("index of o is "+ s.indexOf('o'));
		
		System.out.println("the char at 3 index is "+ s.charAt(3));
		
//		System.out.println(s.charAt(13));
		System.out.println(s.substring(2));
		
		System.out.println(s.substring(2, 4));
		
		//Split always returns an array of string.Here we split based on space
		String[] a = s.split(" ");
		for(String b :a) {
			System.out.println(b);
		}
		
		System.out.println("replace l with k: " +s.replace('l', 'k'));
		
		
		System.out.println(s.toUpperCase());
		
		
		System.out.println(s.toLowerCase());
		
		
		
		
	}

}
