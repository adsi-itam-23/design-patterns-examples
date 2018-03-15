package mx.adsi.designpatterns.decorator;

public class OsuSongPlayer implements SongPlayer{
	
	public int song[];
	
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("repoduciendo cancion");
	}

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("deteniendo cancion");
	}

}
