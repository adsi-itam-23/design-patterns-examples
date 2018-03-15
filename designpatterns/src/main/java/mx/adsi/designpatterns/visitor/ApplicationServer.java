package mx.adsi.designpatterns.visitor;

public class ApplicationServer implements Visitable{
	


	private String ip;
	private double usoMemoria;
	
	public ApplicationServer() {
		super();
	}
	 //accept the visitor
	public void accept(Visitor visitor) {
	   visitor.visit(this);
	}

	public String getIP() {
		return ip;
	}

	public double getUsoMemoria() {
		return usoMemoria;
	}

}
