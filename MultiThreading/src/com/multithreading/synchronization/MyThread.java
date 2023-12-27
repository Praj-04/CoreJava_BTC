package com.multithreading.synchronization;

public class MyThread extends Thread {
	DisplayMessage m;
	String name;

	MyThread(DisplayMessage m, String name) {
		this.m = m;
		this.name = name;

	}
	
	public void run() {
		m.sayHello(name);
	}

}
