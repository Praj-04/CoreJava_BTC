package com.demo.staticinnerclass;

public class Outer {

	static void f1() {
		System.out.println("Outers static method");
	}

	static class Inner {

		static void f2() {
			System.out.println("Inners static method");
		}
	}

	public static void main(String[] args) {
		Outer.f1();
		Outer.Inner.f2();
	}

}
