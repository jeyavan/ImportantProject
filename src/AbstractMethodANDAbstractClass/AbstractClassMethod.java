package AbstractMethodANDAbstractClass;

abstract  class AbstractClassMethod {                                   //abstract class here
//you must be override abstract method for each sub classes	
abstract void turnOff();                                                //abstract method here	
	
public void turnOn() {
		
System.out.println("Turning on");
		
	}
	
	}
class SecondFloor extends AbstractClassMethod {
	
	public void turnOff() {      //override abstract method without using abstract keyword  here	                                                                                             //we should override here if you use abstract method 
	 System.out.println("SecondFloor fan: off");
		
	}
		
	public void turnOn() {                                      
		System.out.println("Turning on-1");
			}
		
		
	}
class ThirdFloor extends AbstractClassMethod{
	
	public void turnOff() {      //override  abstract method without using abstract keyword  here                                                                                   //we should override here if you use abstract method 
		 System.out.println("ThirdFloor's fan is off");
			
			
		}
		
		
	}
	
	
