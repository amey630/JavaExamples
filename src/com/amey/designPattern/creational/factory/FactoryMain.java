package com.amey.designPattern.factory;

public class FactoryMain {

	public static void main(String[] args) {
		
		OperatingSystemFactory osf = new OperatingSystemFactory();
		OS os = osf.getInstance("close");
		os.getSpec();
	}

}
