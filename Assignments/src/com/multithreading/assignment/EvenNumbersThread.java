package com.multithreading.assignment;

public class EvenNumbersThread extends Thread {

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
	}
}
