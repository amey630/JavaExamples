package com.amey.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadAtomicTest {
	
	static int i=0;
	static AtomicInteger a = new AtomicInteger(0);
	
	public static void main(String[] args) {
		Thread t1 = new Thread(()->{
						for(int j=1;j<=100000;j++) {
							//i++; //without synchronized i will not become 200000
							//System.out.println(i);
							
							/*
							 * synchronized (ThreadTest.class) { i++; System.out.println(i);
							 * 
							 * }
							 */
							
							a.incrementAndGet();
							System.out.println(a);
							
						}
						
					}
		);
		Thread t2 = new Thread(new Runnable()
		{

			@Override
			public void run() {
				for(int j=1;j<=100000;j++) {
					//i++;  //without synchronized i will not become 200000
					//System.out.println(i);
					
					/*
					 * synchronized (ThreadTest.class) { i++; System.out.println(i); }
					 */
					
					a.incrementAndGet();
					System.out.println(a);
					
					
				}
				
			}}
		);
		t1.start();
		t2.start();
	}
	

}

class MyRunnable implements Runnable
{

	int i = 0;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int j=1;j<=1000;j++) {
			System.out.println(i = i+1);
		}
	}
	
}
