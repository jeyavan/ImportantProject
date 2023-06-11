package Springframework;

public class Car implements VechicleConsole{     //if you want to implements, you can go right click-Refactor-Extract interface
	
	@Override
	public void carDetails() {
		
		System.out.println("car has four wheel");
		System.out.println("Red color");
		System.out.println("People can sit four");
		System.out.println("*********************************************");
		
	}
	@Override
	public void busDetails() {

		System.out.println("Bus has four wheel");
		System.out.println("Yellow color");
		System.out.println("People can sit more");
		
		
	}

}
