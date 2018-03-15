package mx.adsi.designpatterns.visitor;

public class ServerVisitor implements Visitor {
	
	int numberOfActiveConexions;
	double averageCPUUsage;
	
	public ServerVisitor() {
		super();
		numberOfActiveConexions = 0;
		averageCPUUsage = 0;
	}
	
	public void visit(MailServer mails) {
		// TODO Auto-generated method stub
		numberOfActiveConexions += mails.getConexionesActivas();
	}

	public void visit(ApplicationServer apps) {
		// TODO Auto-generated method stub
		//compute average
	}

}
