package mx.adsi.designpatterns.decorator;

public class OsuThemeSongPlayer extends OsuDecorator{

	public String theme;
	
	public OsuThemeSongPlayer(SongPlayer song, String theme) {
		super(song);
		this.theme = theme;
	}
	
	public void play() {
		super.play();
		System.out.println("USANDO EL TEMA:" + theme);
	}

	public void stop() {
		super.stop();
	}
}
