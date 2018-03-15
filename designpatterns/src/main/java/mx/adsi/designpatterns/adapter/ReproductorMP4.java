package mx.adsi.designpatterns.adapter;

public class ReproductorMP4 implements ReproductorVideo {
	
	public void playMp4(String fileName){
		System.out.println("Reproduciendo formato MP4. Archivo: "+ fileName);	
	}
	public void playAvi(String fileName) {
		// TODO Auto-generated method stub
	}
	public void playWmv(String fileName) {
		// TODO Auto-generated method stub
	}
}
