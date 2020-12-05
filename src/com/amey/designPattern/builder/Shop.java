package com.amey.designPattern.builder;

//Creational design pattern.No need to set all properties while creating object.
//If we directly create phone object then we need to pass all values in Phone constructor including null. here no need to pass null.
public class Shop {
	
	public static void main(String[] args) {
		Phone P = new PhoneBuilder().setOs("ANDROID").setScreenSize(6).getPhone();
		System.out.println(P);
	}
	
	
	

}
