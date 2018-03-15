package mx.adsi.designpatterns.visitor;

public class MailServer implements Visitable{
	
	private String ip;
	private int conexionesActivas;
	
	 //accept the visitor
	public void accept(Visitor visitor) {
	   visitor.visit(this);
	}

	public String getIP() {
		return ip;
	}

	public int getConexionesActivas() {
		return conexionesActivas;
	}

}
