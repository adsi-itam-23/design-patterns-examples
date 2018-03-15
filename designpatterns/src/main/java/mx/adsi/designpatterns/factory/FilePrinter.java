package mx.adsi.designpatterns.factory;

import java.io.File;

public abstract class FilePrinter {
	
	public static enum FileType{CSV, XML, JSON}
	public File file;
	public FileType type;
	
	public FilePrinter(File file, FileType type) {
		this.file = file;
		this.type = type;
	}
	
	public abstract void printByAttributes();

	
	public void setFile(File file) {
		this.file = file;
	}

	public FileType getType() {
		return type;
	}


	
}
