package com.amey.designPattern.behavioral.template;

public abstract class FileDownload {
	
	  abstract void gatherAllInfo();
	  abstract void generateFile();
	  abstract void downloadToPath();

	   //template method
	  public final void download(){
	     
		  gatherAllInfo();

		  generateFile();

		  downloadToPath();
	   }

}
