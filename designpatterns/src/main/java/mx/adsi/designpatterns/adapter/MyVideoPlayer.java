package mx.adsi.designpatterns.adapter;

public class MyVideoPlayer implements VideoPlayer {
	VideoAdapter videoAdapter;
	
	public void reproduce(String formato, String fileName) {
		if(formato.equals("WMV")){
	         System.out.println("Reproduciendo WMV: " + fileName);					
		} else {
			videoAdapter = new VideoAdapter(formato);
			videoAdapter.reproduce(formato, fileName);
		}
	}

}