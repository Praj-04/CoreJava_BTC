package com.concurrentcollection;

import java.util.concurrent.BlockingQueue;

public class OrderProducer implements Runnable{

	private BlockingQueue<String> queue;
	
	public OrderProducer(BlockingQueue<String> queue) {
		this.queue=queue;
	}

	@Override
	public void run() {
		try {
			queue.put("MAcBook");
			queue.put("Dell");
			queue.put("HP");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	


}
