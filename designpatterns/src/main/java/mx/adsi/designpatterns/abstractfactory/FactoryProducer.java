package mx.adsi.designpatterns.abstractfactory;

public class FactoryProducer {
	
   public static AbstractCarFactory getFactory(String choice){
   
      if(choice.equalsIgnoreCase("CONSOLA")){
         return new ConsolaFactory();
         
      }else if(choice.equalsIgnoreCase("MOTOR")){
         return new MotorFactory();
      }
      
      return null;
   }
		
}
