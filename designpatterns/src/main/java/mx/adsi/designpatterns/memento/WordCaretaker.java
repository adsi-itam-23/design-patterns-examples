package mx.adsi.designpatterns.memento;

public class WordCaretaker {

	private Object obj;
	
	public void save(WordFileManager wordFile){
		this.obj = wordFile.save();
	}
	
	//Ir al estado anterior del documento cuando se oprima control z
	public void ctrlZ(WordFileManager wordFile){
		wordFile.revertLastChange(obj);
	}
}