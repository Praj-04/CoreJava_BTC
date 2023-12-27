package com.demo.multithreading;

public class MultiThreading extends Thread {

	public void run() {
		System.out.println("Thread Name :"+Thread.currentThread().getName());
//		Thread ct = Thread.currentThread();
//		ct.setName("changed the thread name");
//		System.out.println(ct.getName());
//		for (int i = 1; i <= 200; i++) {
//			System.out.print("i: " + i + "\t");
//
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				System.out.println("Child thread exiting");
//			}
//
//		}
	}

	public static void main(String[] args) throws InterruptedException {
//		Thread ct = Thread.currentThread();
//		System.out.println(ct.getName());

		MultiThreading mt = new MultiThreading();
		mt.setPriority(MIN_PRIORITY);
		mt.setName("mt");
		mt.start();

		MultiThreading mt1 = new MultiThreading();
		mt1.setPriority(MAX_PRIORITY);
		mt1.setName("mt1");
		mt1.start();
		
//		for (int j = 1; j <= 200; j++) {
//			System.out.print("j: " + j + "\t");
//
//			Thread.sleep(1000);
//
//		}

	}

}
