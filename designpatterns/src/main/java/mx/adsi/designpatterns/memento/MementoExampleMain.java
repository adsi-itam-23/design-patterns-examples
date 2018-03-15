package mx.adsi.designpatterns.memento;
/*Imagine we are managing Microsof Word's text
 * and we need to store the changes(states) to revert
 * them when the user presses control + Z
 */
public class MementoExampleMain {

	public static void main(String[] args) {
		
		WordCaretaker caretaker = new WordCaretaker();
		
		WordFileManager wordManager = new WordFileManager("data.txt");
		wordManager.write("Este es un archivo de word\n");
		System.out.println(wordManager+"\n\n");
		
		// Salvamos el estado
		caretaker.save(wordManager);
		// Modificamos
		wordManager.write("Le agrgamos mas datos al archivo\n");
		System.out.println(wordManager+"\n\n");
		
		//El usuario apreto ctrl+z
		caretaker.ctrlZ(wordManager);
		
		//checking file content again
		System.out.println(wordManager+"\n\n");
		
	}

}