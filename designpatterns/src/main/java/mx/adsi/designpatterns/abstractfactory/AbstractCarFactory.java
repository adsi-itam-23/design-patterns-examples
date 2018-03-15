package mx.adsi.designpatterns.abstractfactory;

public abstract class AbstractCarFactory {
	abstract Motor getMotor(String modeloMotor);
	abstract Consola getConsola(String modeloConsola) ;	
}
