package mx.adsi.designpatterns.adapter;

public interface ReproductorVideo {
	public void playMp4(String fileName);
	public void playAvi(String fileName);
	public void playWmv(String fileName);
}
