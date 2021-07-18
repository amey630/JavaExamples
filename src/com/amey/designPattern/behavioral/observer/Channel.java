package com.amey.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {
	
	private List<Subscriber> subs = new ArrayList<Subscriber>();
	String title;
	
	public void subscribe(Subscriber sub) {
		subs.add(sub);
	}
	
	public void removeSubscribe(Subscriber sub) {
		subs.remove(sub);
	}
	
	public void notifySbscibers() {
		
		for(Subscriber sub : subs) {
			sub.update();
		}
		
	}
	
	public void upload(String title) {
		this.title = title;
		notifySbscibers();
	}
	
	
}
