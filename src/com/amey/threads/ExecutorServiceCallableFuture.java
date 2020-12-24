package com.amey.threads;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;


public class ExecutorServiceCallableFuture {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService service = Executors.newFixedThreadPool(4);
		Future<Integer> future = service.submit(new Task());
		
		try {
			//future is just placeholder that returning value of thread after completion
			
			//if future don't have value within 2 sec then TimeoutException will throw
			//System.out.println(future.get(2, TimeUnit.SECONDS));
			
			// future.get() is blocking operation. It will wait to complete thread and threadpool set value to future
			System.out.println(future.get());//here main thread will wait till to set val to future
			
			
			future.cancel(false);//it will cancel task from threadpool if not started else nothing will happen
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} /*
			 * catch (TimeoutException e) { // TODO Auto-generated catch block
			 * e.printStackTrace(); }
			 */
	}

}
//Callable interface has call method, it is used to return generic value. run() can not return value.
class Task implements Callable<Integer>
{
	@Override
	public Integer call() throws Exception {
		Thread.sleep(5000);
		return new Random().nextInt();
	}
	
}
