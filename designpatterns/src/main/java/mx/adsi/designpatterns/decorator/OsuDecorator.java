package mx.adsi.designpatterns.decorator;

public class OsuDecorator implements SongPlayer{
	
	SongPlayer song;
	
	public OsuDecorator(SongPlayer song2) {
		this.song = song2;
	}
	
	public void play() {
		this.song.play();
	}

	public void stop() {
		this.song.stop();
	}

}
