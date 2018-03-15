package mx.adsi.designpatterns.visitor;

public class ServerMonitoringSystem {
	
	public static void main(String args[]) {
		MailServer servers[] = {new MailServer(),new MailServer(),new MailServer()};
		for(MailServer mail : servers) {
			mail.setConexionesActivas(1);
		}
		ServerVisitor visitor = new ServerVisitor();
		for(MailServer mail : servers) {
			mail.accept(visitor);
		}
		System.out.println(visitor.numberOfActiveConexions);
	}	
}
