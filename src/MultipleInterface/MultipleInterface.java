package MultipleInterface;

interface  MultipleInterface {
public void Add();                 //interface method

}
interface Total{
	public void Sub();             //interface method
	
}
class Sum implements MultipleInterface,Total{
	 
	public void Add() {
		int a=20; int b=10;
	System.out.println("ADD: "+(a+b));	
		
	}
	public void Sub() {
	 int a=10; int b=30;	
	System.out.println("SUB: "+(a-b));	
		
		}
	
}