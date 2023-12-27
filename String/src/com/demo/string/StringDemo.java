package com.demo.string;

public class StringDemo {

	public static void main(String[] args) {

		String s1 = "Prajna";
		
		String s2 = new String("Adi");
		
		String s = new String("Prajna");
		
		System.out.println("The strings are : "+s1.equals(s)); // String,wrapper class, String Buffer overrides the equals method of Object class
		
		char[] c= {'a','e','i','o','u'};
		String s3 = new String(c);
		
		byte b[]= {65,66,67};
		String s4 = new String (b);
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
	}

}
