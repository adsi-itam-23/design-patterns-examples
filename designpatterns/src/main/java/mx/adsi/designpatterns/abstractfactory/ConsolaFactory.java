package mx.adsi.designpatterns.abstractfactory;

public class ConsolaFactory extends AbstractCarFactory{
	
	@Override
	Motor getMotor(String modeloMotor) {
		// TODO Auto-generated method stub		
		return null;
	}
	@Override
	Consola getConsola(String modeloConsola) {
		
		if(modeloConsola.equals("AUDI")) return new ConsolaAudi();
		
		return null;
	}
	
}
