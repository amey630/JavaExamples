package com.amey.designPattern.observer;

public class Youtube {

	public static void main(String[] args) {
		Channel tulesko = new  Channel();
		
		Subscriber s1 = new Subscriber("Sub1");
		Subscriber s2 = new Subscriber("Sub2");
		Subscriber s3 = new Subscriber("Sub3");
		Subscriber s4 = new Subscriber("Sub4");
		Subscriber s5 = new Subscriber("Sub5");
		
		tulesko.subscribe(s1);
		tulesko.subscribe(s2);
		tulesko.subscribe(s3);
		tulesko.subscribe(s4);
		tulesko.subscribe(s5);
		
		
		
		s1.subscribeChannel(tulesko);
		s2.subscribeChannel(tulesko);
		s3.subscribeChannel(tulesko);
		s4.subscribeChannel(tulesko);
		s5.subscribeChannel(tulesko);
		
		tulesko.upload("How to compile program");
		
		System.out.println("--One user unsubscribe---");
		tulesko.removeSubscribe(s3);
		tulesko.upload("How to run program !!!");

	}

}
