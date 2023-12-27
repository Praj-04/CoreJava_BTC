package com.demo.multithreading;

import java.util.Scanner;

public class JoinDemo extends Thread {
	static int n, sum = 0;

	public void run() {
		for (int i = 0; i <= JoinDemo.n; i++) {
			JoinDemo.sum += i;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		System.out.println("Sum of forst 'N' numbers");
		System.out.println("Enter N:");
		Scanner sc = new Scanner(System.in);
		JoinDemo.n = sc.nextInt();

		JoinDemo d = new JoinDemo();
		d.start();
		try {
			d.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Sum of first" + JoinDemo.n + "numbers is :" + JoinDemo.sum);
		long end = System.currentTimeMillis();
		System.out.println("Total time taken is "+(end-start)/1000+" seconds");
	}

}
