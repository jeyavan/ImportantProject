package JavaExceptions;
import java.lang. ArithmeticException;
public class ErrorHandling {
	
	
	 static void Age(int age) throws ArithmeticException   {
		 
		    if (age >18) {      
		    	
		    	throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		    }
		    else {
		      System.out.println("Access granted - You are old enough!");
		    }
		  }
public static void main(String[] args) {
	Age(15);
	 }
 }
