package mx.adsi.designpatterns.proxy;

public class BitcoinWebService implements WebService {

	public String post(String params) {
		// Imagine que nos conectamos a un servidor y esperamos la respuesta
		return "303";
	}

	public String get(String params) {
		// Imagine que nos conectamos a un servidor y esperamos la respuesta
		return "404";
	}
	
}
