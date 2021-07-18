package com.amey.designPattern.behavioral.template;

public class CsvDownload extends FileDownload{

	@Override
	void gatherAllInfo() {
		System.out.println("Gather data for CSV");
		
	}

	@Override
	void generateFile() {
		System.out.println("Generate CSV");
		
	}

	@Override
	void downloadToPath() {
		System.out.println("Download CSV");
	}

}
