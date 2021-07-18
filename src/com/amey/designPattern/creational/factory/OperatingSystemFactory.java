package com.amey.designPattern.creational.factory;

public class OperatingSystemFactory {

	public OS getInstance(String type) {
		if ("open".equalsIgnoreCase(type)) {
			return new Android();
		} else if ("close".equalsIgnoreCase(type)) {
			return new IOS();
		} else {
			return new Window();
		}
	}

}
