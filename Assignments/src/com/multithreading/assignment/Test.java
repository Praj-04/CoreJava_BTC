package com.multithreading.assignment;

public class Test {

	public static void main(String[] args) {
EvenNumbersThread e = new EvenNumbersThread();
OddNumbersThread o = new OddNumbersThread();
e.start();
o.start();
		
		
	}

}
