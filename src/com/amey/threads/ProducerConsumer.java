package com.amey.threads;

public class ProducerConsumer {

	public static void main(String[] args) {
		
	
		//1. MyBlockingQueue with locks
		//MyBlockingQueue<Integer> bq = new MyBlockingQueue<Integer>(10);
		
		//2.MyBlockingQueueWaitNotify  with wait() notifyAll()
		MyBlockingQueueWaitNotify<Integer> bq = new MyBlockingQueueWaitNotify<Integer>(10);
		
		
			final Runnable producer = () -> {
				while (true) {
					try {
						Thread.sleep(500);
						bq.put(1);
						System.out.println("producer size : "+bq.size());
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
						System.out.println("consumer size : "+bq.size());
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
