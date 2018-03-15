package mx.adsi.designpatterns.memento;

public class WordFileManager {

	private String fileName;
	private StringBuilder content;
	
	public WordFileManager(String file){
		this.fileName=file;
		this.content=new StringBuilder();
	}
	
	@Override
	public String toString(){
		return this.content.toString();
	}
	
	public void write(String str){
		content.append(str);
	}
	
	public FileMemento save(){
		return new FileMemento(this.content,this.fileName);
	}
	
	public void revertLastChange(Object obj){
		FileMemento memento = (FileMemento) obj;
		this.fileName = memento.getFileName();
		this.content =  memento.getText();
	}		
}
