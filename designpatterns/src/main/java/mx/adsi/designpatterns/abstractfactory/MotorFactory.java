package mx.adsi.designpatterns.abstractfactory;

public class MotorFactory extends AbstractCarFactory {

	@Override
	Motor getMotor(String modeloMotor) {
		// TODO Auto-generated method stub
		if(modeloMotor.equals("AUDI")) return new MotorAudi();
		
		return null;
	}

	@Override
	Consola getConsola(String modeloCOnsola) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
