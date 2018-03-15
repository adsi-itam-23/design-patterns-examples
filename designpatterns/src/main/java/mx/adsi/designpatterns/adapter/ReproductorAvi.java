package mx.adsi.designpatterns.adapter;

public class ReproductorAvi implements ReproductorVideo {

	public void playMp4(String fileName) {
		// TODO Auto-generated method stub
	}
	public void playAvi(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Reproduciendo formato AVI. Archivo: "+ fileName);	
	}
	public void playWmv(String fileName) {
		// TODO Auto-generated method stub
	}
}