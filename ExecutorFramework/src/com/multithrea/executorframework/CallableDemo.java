package com.multithrea.executorframework;

import java.util.concurrent.Callable;

public class CallableDemo implements Callable<Integer> {

	int num;

	CallableDemo(int num) {
		this.num = num;
	}

	@Override
	public Integer call() throws Exception {
		System.out.println(Thread.currentThread().getName() + "is calculating all numbers upto" + num);
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum += num;
		}
		return sum;
	}

}
