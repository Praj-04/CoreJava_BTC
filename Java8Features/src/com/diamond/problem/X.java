package com.diamond.problem;

public interface X {
	default void myMethod() {
		System.out.println("method inside X");
	}
	
}
