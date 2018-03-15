package mx.adsi.designpatterns.decorator;

public class OsuDecoratorMain{

	public static void main(String[] args) {
		SongPlayer player1 = new OsuThemeSongPlayer(new OsuSongPlayer(),"tema azul");
		player1.play();
		System.out.println("STOP");
		player1.stop();
		
		System.out.println("\nPLAYER 2\n");
		SongPlayer player2 = new OsuVideoSongPlayer(new OsuThemeSongPlayer(new OsuSongPlayer(),"tema azul"),"video");
		player2.play();
		System.out.println();
		player2.stop();
	}

}