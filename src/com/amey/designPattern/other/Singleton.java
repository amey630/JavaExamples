package com.amey.designPattern.other;

//creational design pattern
public class Singleton {

	// create an object of SingleObject early loading.
	private static Singleton instance = new Singleton();

	// make the constructor private so that this class cannot be
	// instantiated
	private Singleton() {
	}

	// Get the only object available
	public static Singleton getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}
}