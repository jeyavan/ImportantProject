package Polymorphism;

public class MathPolymorphismDemo {

	public static void main(String[] args) {
		MathPolymorphism maths1=new MathPolymorphism();
		MathPolymorphism maths2=new Sub();
		MathPolymorphism maths3=new Mul();
		maths1.math();
		maths2.math();
		maths3.math();
		
	}

}
