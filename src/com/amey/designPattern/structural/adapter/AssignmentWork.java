package com.amey.designPattern.adapter;

public class AssignmentWork {
	
	private Pen  p;

	public void writeAssignment(String str) {
		p.write(str);
	}

	public Pen getP() {
		return p;
	}

	public void setP(Pen p) {
		this.p = p;
	}
}
