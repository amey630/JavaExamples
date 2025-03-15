package com.amey.threads;

import java.util.LinkedList;
import java.util.Queue;

public class MyBlockingQueueWaitNotify<T> {
	
	int max;
	Queue<T> queue;

	public MyBlockingQueueWaitNotify(int max) {
		queue = new LinkedList<>();
		this.max = max;
	}
	
	public synchronized void put(T t) {
		
		try {
			System.out.println("size in put method : "+queue.size());
			while(queue.size() == max) {
				wait();
			}
			queue.add(t);
			notifyAll();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
		
	@SuppressWarnings("finally")
	public synchronized T take() {
		T item = null;
		try {
			while(queue.size() == 0) {
				wait();
			}
			item = queue.remove();
			notifyAll();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			return item;
		}
		
		
	}
	
	public int size() {
		return queue.size();
	}
	
	
	
}
