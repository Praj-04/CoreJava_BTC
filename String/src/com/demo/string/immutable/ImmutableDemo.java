package com.demo.string.immutable;

public class ImmutableDemo {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "World";
		
		System.out.println("Before concat: " + "\ns1:" + s1 + "\ns2:" +s2);
		s1 = s1.concat(s2);
		
		System.out.println("After concat: " + "\ns1:" + s1 + "\ns2:" +s2);
		
	}

}
