package mx.adsi.designpatterns.abstractfactory;

public class Audi implements Car{
	
	private Motor motor;
	private Consola consola;
	
	public Audi(Motor motor, Consola consola) {
		super();
		this.motor = motor;
		this.consola = consola;
	}
	
	public void arrancar() {
		motor.arrancar();
		consola.encender();		
	}

	public void apagar() {
		motor.apagar();
		consola.apagar();
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Consola getConsola() {
		return consola;
	}

	public void setConsola(Consola consola) {
		this.consola = consola;
	}
	
}
