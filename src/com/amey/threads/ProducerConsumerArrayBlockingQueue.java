package com.amey.threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

//using ArrayBlockingQueue
public class ProducerConsumerArrayBlockingQueue {

	public static void main(String[] args) {
		
		/*
		 * ArrayBlockingQueue thread safe data structure, multiple producer and consumer
		 * can access the queue simultaniously. 
		 * If there is no space to put/ Nothing to take from queue - then it will wait.
		 */
		BlockingQueue<Integer> bq = new ArrayBlockingQueue<Integer>(10);
	
			final Runnable producer = () -> {
				while (true) {
					try {
						Thread.sleep(500);
						bq.put(1);
						System.out.println("producer size"+bq.size());
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			};
			new Thread(producer).start();
			new Thread(producer).start();

			
			final Runnable consumer = () -> {
				while (true) {
					try {
						Thread.sleep(2000);
						bq.take();
						System.out.println("consumer size"+bq.size());
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			};
			new Thread(consumer).start();
			new Thread(consumer).start();
			

	}

}
