package MethodCalling;

public class MathMethod {
	//method input->parameters/arguments
	static void sum(float a,float b) {        //Method header
	System.out.println("Add value: "+ (a+b)); //method body
	}
	static void sub() {                       //method definition(whole sub()method))
		int a=10;
		int b=20;
	System.out.println("sub value: "+(a-b));
		 
	}
	static void mul(long a) {
	System.out.println("Mul value: "+a*345L);
		}
	public static void main(String[] args) {
		
	    sum(-10.5f,-20.3f); //passing arguments 
		sub();              //method calling
		mul(23L);
		
	}
	
	

}
