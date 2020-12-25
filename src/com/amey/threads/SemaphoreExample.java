package com.amey.threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/*We have multiple 100 threads but we can make only 5 call to any API in that scenario we use Semaphore
 * Semaphore maintains permits.semaphore.acquire() decrease permit and semaphore.release() increase permit.
 * If thread get permit from semaphore then it execute otherwise it wait to release() for other thread. 
 * 
sfsf*/
public class SemaphoreExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService service = Executors.newFixedThreadPool(50);
		Semaphore semaphore = new Semaphore(5);

		for (int i = 0; i < 100; i++) {
			service.execute(new SemaphoreExampleTask(semaphore));
		}
	}

}

class SemaphoreExampleTask implements Runnable {
	Semaphore semaphore = null;
	public SemaphoreExampleTask(Semaphore semaphore) {
		this.semaphore = semaphore;
	}

	@Override
	public void run() {
		//semaphore.acquire(); // it allows permit if available, else wait to get permit. It throws interrupted exception
		//semaphore.tryAcquire(); // if not available then do not block
		//semaphore.tryAcquire(timeout); // if not available then do not block with timeout
		semaphore.acquireUninterruptibly();
		System.out.println("semaphore.availablePermits()=" + semaphore.availablePermits() +":: "+ Thread.currentThread().getName());
		semaphore.release();
	}

}
