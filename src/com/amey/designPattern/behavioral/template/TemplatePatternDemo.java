package com.amey.designPattern.behavioral.template;

/*Template Method is a behavioral design pattern that defines the skeleton of an algorithm in the superclass but lets
subclasses override specific steps of the algorithm without changing its structure.*/


public class TemplatePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileDownload f= new CsvDownload();
		f.download();
		
		FileDownload f2= new PdfDownload();
		f2.download();

	}

}
