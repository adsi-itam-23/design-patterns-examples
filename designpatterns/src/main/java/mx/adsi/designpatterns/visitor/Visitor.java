package mx.adsi.designpatterns.visitor;


public interface Visitor{
	
  public void visit(MailServer mails);
  
  public void visit(ApplicationServer apps);
  
}