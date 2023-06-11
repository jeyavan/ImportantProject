package Polymorphism;

public class MathPolymorphism {
	
	int a=10;
	int b=20;
	public void math() {
		System.out.println("\n        MATH");
		System.out.println("ADD: "+(a+b));
		
	}
}
	class Sub extends MathPolymorphism{
		
		public void math() {
			System.out.println("SUB: "+(a-b));
			
			
		}
	}
		class Mul extends MathPolymorphism{
			
			public void math() {
				System.out.println("MUL: "+(a*b));
			}
			
		}
		
		
	


