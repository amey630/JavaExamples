package com.amey.designPattern.behavioral.template;

public class PdfDownload extends FileDownload{

	@Override
	void gatherAllInfo() {
		System.out.println("Gather data for PDF");
		
	}

	@Override
	void generateFile() {
		System.out.println("Generate PDF");
		
	}

	@Override
	void downloadToPath() {
		System.out.println("Download PDF");
	}

}
