package com.demo.multithreading.yield;

public class YieldRunner {

	public static void main(String[] args) {
YieldDemo yd = new YieldDemo();
yd.start();

for(int i=1;i<=10;i++) {
	System.out.println("Parent Thread");
	
}
	}

}
