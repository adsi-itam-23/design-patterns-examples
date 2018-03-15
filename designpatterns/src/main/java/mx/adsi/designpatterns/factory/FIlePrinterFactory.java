package mx.adsi.designpatterns.factory;

import java.io.File;

public class FIlePrinterFactory {
	
	
	public static  FilePrinter getFilePrinter(FilePrinter.FileType type, File file) {
		switch(type) {
			case CSV:
				return new CSVPrinter(file);
			case XML:
				return new XMLPrinter(file);
			case JSON:
			default:
				System.out.println("Format not supported yet");
				return null;
		}
	}
}
