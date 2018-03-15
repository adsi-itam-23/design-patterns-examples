package mx.adsi.designpatterns.decorator;

public class OsuVideoSongPlayer extends OsuDecorator{

	public String video;
	
	public OsuVideoSongPlayer(SongPlayer song, String video) {
		super(song);
		this.video = video;
	}
	
	public void play() {
		super.play();
		System.out.println("Reproduciendo de fondo el video:" + video);
	}

	public void stop() {
		super.stop();
		System.out.println("Deteniendo el video");
	}
}