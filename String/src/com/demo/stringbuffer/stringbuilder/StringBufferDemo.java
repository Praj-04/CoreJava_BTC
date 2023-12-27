package com.demo.stringbuffer.stringbuilder;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		
		
		System.out.println(sb.append("Work hard "));
		System.out.println(sb.append("Every day is a  new opportunity"));
		System.out.println(sb.capacity());
		
		StringBuffer sb1 = new StringBuffer("abcdefgh");
		
		System.out.println(sb1.reverse());
		
		System.out.println(sb1.charAt(7));
		
		System.out.println(sb1.insert(1, "xyz"));
		System.out.println(sb1.delete(0, 2));
	}

}
