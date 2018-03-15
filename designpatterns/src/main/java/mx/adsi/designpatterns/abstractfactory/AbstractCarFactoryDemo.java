package mx.adsi.designpatterns.abstractfactory;

public class AbstractCarFactoryDemo {
	
	public static void main(String[] args) {

      
      AbstractCarFactory motorFactory = FactoryProducer.getFactory("MOTOR");

   
      Motor motor = motorFactory.getMotor("AUDI");

      AbstractCarFactory consoleFactory = FactoryProducer.getFactory("CONSOLA");

      
      Consola consola = consoleFactory.getConsola("AUDI");

      Car audi = new Audi(motor, consola);
      audi.arrancar();
      audi.apagar();
   

   }

}
