package com.amey.designPattern.adapter;

public class PenAdapter implements Pen {

	@Override
	public void write(String str) {
		 PilotPen pp = new PilotPen();
		 pp.mark(str);

	}

}
