package com.multithreading.synchronization;

public class SynchronizedDemo {

	public static void main(String[] args) {
DisplayMessage dm = new DisplayMessage();
MyThread t1 = new MyThread(dm, "Praj");
MyThread t2 = new MyThread(dm, "Adi");

t1.start();
t2.start();

	}

}
