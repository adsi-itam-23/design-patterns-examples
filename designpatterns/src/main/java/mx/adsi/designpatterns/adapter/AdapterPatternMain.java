package mx.adsi.designpatterns.adapter;

public class AdapterPatternMain {

	public static void main(String[] args) {
		MyVideoPlayer videoPlayer = new MyVideoPlayer();
		
		videoPlayer.reproduce("MP4", "StarWars.mp4");
		videoPlayer.reproduce("AVI", "Pokemon.mp4");
	}
}