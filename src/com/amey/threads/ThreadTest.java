package com.amey.threads;

public class ThreadTest {
	
	static int i=0; 
	
	public static void main(String[] args) {
		Thread t1 = new Thread(()->{
						for(int j=1;j<=10000;j++) {
							int k = i;
							k++;
							i=k;
							
							System.out.println(i);
						}
						
					}
		);
		Thread t2 = new Thread(new Runnable()
		{

			@Override
			public void run() {
				for(int j=1;j<=10000;j++) {
					int k = i;
					k++;
					i=k;
					System.out.println(i);
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
