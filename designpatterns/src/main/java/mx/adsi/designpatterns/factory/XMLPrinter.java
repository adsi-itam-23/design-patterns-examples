package mx.adsi.designpatterns.factory;

import java.io.File;

public class XMLPrinter extends FilePrinter{



	public XMLPrinter(File file) {
		super(file, FileType.XML);
	}

	@Override
	public void printByAttributes() {
		//read xml
		//print tag : value
	}

}
