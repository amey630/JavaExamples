package com.amey.designPattern.behavioral.observer;

public class Subscriber {

	private String name;
	private Channel channel;

	public Subscriber(String name) {
		super();
		this.name = name;
	}

	public void update() {
		System.out.println("Hey " + name + ", video uploded " + channel.title);
	}

	public void subscribeChannel(Channel ch) {
		channel = ch;
	}

}
