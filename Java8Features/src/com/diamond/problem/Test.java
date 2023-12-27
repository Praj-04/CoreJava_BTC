package com.diamond.problem;

public class Test implements A, X {

	public static void main(String[] args) {
		A a = new Test();
		a.myMethod();
	}

	@Override
	public void myMethod() {
		System.out.println("Default Method overriden inside Test");
	}

}
