package mx.adsi.designpatterns.factory;

import java.io.File;

public class CSVPrinter extends FilePrinter{
	
	public CSVPrinter(File file) {
		super(file, FileType.CSV);
	}

	@Override
	public void printByAttributes() {
		//read csv
		//store column headers if existing
		//for each row
		//print header : value
	}
}
