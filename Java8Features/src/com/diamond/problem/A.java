package com.diamond.problem;

public interface A {

	default void myMethod() {
		System.out.println("method inside A");
	}
	
}
