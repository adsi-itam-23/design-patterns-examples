package mx.adsi.designpatterns.adapter;

public class VideoAdapter implements VideoPlayer{
	
	ReproductorVideo reproductor;
	
	public VideoAdapter(String format) {
		if(format.equals("MP4"))
			reproductor = new ReproductorMP4();
		else if(format.equals("AVI"))
			reproductor = new ReproductorAvi();
	}

	public void reproduce(String formato, String fileName) {
	      if(formato.equalsIgnoreCase("MP4")){
	    	  reproductor.playMp4(fileName);
	      }
	      else if(formato.equalsIgnoreCase("AVI")){
	    	  reproductor.playAvi(fileName);
	      }
	}
}