package mx.adsi.designpatterns.memento;

public class FileMemento {
	
	private StringBuilder text;
    private String fileName;

    public FileMemento(StringBuilder text, String fileName) {
		this.text = text;
		this.fileName = fileName;
	}

    public StringBuilder getText() {
        return text;
    }

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setText(StringBuilder text) {
		this.text = text;
	}
}
