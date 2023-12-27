package com.demo.singlethreading;

public class SingleThreadingDemo {

	public static void main(String[] args) {

		SingleThreadingDemo s = new SingleThreadingDemo();
		s.printNumbers();
		for (int j = 1; j <= 200; j++) {
			System.out.print("j: " + j + "\t");
		}

	}

	void printNumbers() {
		for (int i = 1; i <= 200; i++) {
			System.out.print("i: " + i + "\t");
		}
		System.out.println();
	}

}
