package com.java8.lambdas;

public class Test {

	public static void main(String[] args) {
  
		Sum s = (x,y) ->  System.out.println(x*y);
		s.sum(2,4);
		
		
	}

}
