package com.amey.designPattern.adapter;

//structural design pattern that allows two unrelated/uncommon interfaces to work together
//In other words, the adapter pattern makes two incompatible interfaces compatible without changing their existing code.
//by adding adapter between them
public class School {

	
	public static void main(String[] args) {
		AssignmentWork aw = new AssignmentWork();
		Pen P = new PenAdapter();
		aw.setP(P);
		aw.writeAssignment("Assignment task writing with pilot pen");
	}
}
