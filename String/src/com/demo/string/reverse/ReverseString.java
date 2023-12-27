package com.demo.string.reverse;

public class ReverseString {
	
	public String firstWay(String actual) {
		String reversed="";
		for(int i=actual.length();i>0;i--) {
			reversed = reversed+actual.charAt(i-1);
		}
		return reversed;
		
	}

	public static void main(String[] args) {

		String s = "Prajna";
		
		ReverseString rs = new ReverseString();
		System.out.println(rs.firstWay(s));
	
	}

}
