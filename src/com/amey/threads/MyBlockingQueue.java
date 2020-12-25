package com.amey.threads;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockingQueue<T> {
	
	int max;
	Queue<T> queue = new LinkedList<T>();
	ReentrantLock lock = new ReentrantLock();
	Condition takeCond = lock.newCondition();
	Condition putCond = lock.newCondition();
	
	public MyBlockingQueue(int max) {
		queue = new LinkedList<>();
		this.max = max;
	}
	
	public void put(T t) {
		lock.lock();
		
		try {
			System.out.println("size in put method : "+queue.size());
			while(queue.size() == max) {
				putCond.await();
			}
			queue.add(t);
			takeCond.signalAll();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
		
	@SuppressWarnings("finally")
	public T take() {
		lock.lock();
		T item = null;
		try {
			while(queue.size() == 0) {
				takeCond.await();
			}
			item = queue.remove();
			putCond.signalAll();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
			return item;
		}
		
		
	}
	
	public int size() {
		return queue.size();
	}
	
	
	
}
