package com.amey.threads;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {
	
	public static void main(String[] args) throws InterruptedException {
		//**********************************************************************
		//Fixed Thread Pool
		ExecutorService service = Executors.newFixedThreadPool(4);
		for (int i = 0; i < 100; i++) {
			service.execute(
									() ->  {
									System.out.println("Thread Name : " + Thread.currentThread().getName());
									for (int j = 0; j < 10000; j++) {
										System.out.println(j);
									}
									}
						);
		}
		System.out.println("Thread Name (Main thread)= " + Thread.currentThread().getName());
		
		//**********************************************************************
		//cached thread pool - automatically n number of threads get created, reused and killed in cached.
		ExecutorService cachedThreadservice = Executors.newCachedThreadPool();
		cachedThreadservice.execute(() ->  System.out.println("CachedThread Executor Thread Name : " + Thread.currentThread().getName()));
		//**********************************************************************
		//Scheduled ThreadPool - to do some schedule task 
		ScheduledExecutorService scThService = Executors.newScheduledThreadPool(10);
		
		//Task to run after 5 sec delay
		scThService.schedule(()->System.out.println("Task to run after 5 sec delay"), 5, TimeUnit.SECONDS);
		
		//Task to run repeatedly every 6 sec regardless of previous task complete
		scThService.scheduleAtFixedRate(()->System.out.println("Task to run repeatedly every 2 sec wth initial delay 3 sec"),
				3, 2, TimeUnit.SECONDS);
		
		//Task to run repeatedly after 8 sec after previous task complete 
		scThService.scheduleWithFixedDelay(()->System.out.println("Task to run repeatedly after 8 sec after "
				+ "previous task complete  wth initail dealy 10 sec"), 
						10, 8, TimeUnit.SECONDS);
		
		//**********************************************************************
		//Single Thread Executor - There is only one thread, so it ensures that task two will run after task one
		ExecutorService singleThreadService = Executors.newSingleThreadExecutor();
		singleThreadService.execute(() ->  System.out.println("SingleThreadExecutor Thread Name : " + Thread.currentThread().getName()));
		
		
		//**********************************************************************
		//service.shutdown() it will initiate shutdown, it will execute first all task submitted to service. 
		//service.execute() will throw rejectionExecutionException after shutdown
		//service.isShutdown()  returns true if already initiated shutdown 
		//service.isTerminated() returns true if already completed all task by service
		//service.shutdown(); 
		List<Runnable> runnables = service.shutdownNow();//immediate shutdown and returns submitted remaining task
		
		//service.awaitTermination(25, TimeUnit.SECONDS);
		
		
		
		
	}

}
