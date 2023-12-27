package com.demo.multithreading.yield;

public class YieldDemo extends Thread {

	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Child Thread");
			Thread.yield();
		}
	}

	

}
