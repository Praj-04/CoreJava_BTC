package com.multithreading.synchronization.classlock;

public class SynchronizedDemo {

	public static void main(String[] args) {
MyThread t1 = new MyThread( "Praj");
MyThread t2 = new MyThread( "Adi");

t1.start();
t2.start();

	}

}
