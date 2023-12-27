package com.multithrea.executorframework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableRunner {

	public static void main(String[] args) {
		CallableDemo[] c = { new CallableDemo(4), new CallableDemo(10), new CallableDemo(8), new CallableDemo(14),
				new CallableDemo(5) };
		ExecutorService service = Executors.newFixedThreadPool(3);

		for (CallableDemo callableDemo : c) {
			Future<Integer> future = service.submit(callableDemo);
			try {
				System.out.println(future.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		service.shutdown();

	}

}
