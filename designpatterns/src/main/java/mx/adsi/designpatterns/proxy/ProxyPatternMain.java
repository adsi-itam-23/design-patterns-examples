package mx.adsi.designpatterns.proxy;

public class ProxyPatternMain {

	public static void main(String args[]) {
		//imaginar que queremos probar una clase, pero 
		//su respuesta no deberia de depender de si puede  o no
		//conectarse al web service, solo en base a lo que recibe
		//entonces "simulamos" o "proxeamos" el web service
		 WebService servicio = new WebServiceProxy();
		 System.out.println(servicio.post("params"));
	}
}
