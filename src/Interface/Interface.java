package Interface;

//public class Interface {
interface Math{
	public void Add();
	public void Sub();

	}
class Sum implements Math {
	int a=20;
	int b=10;
	public void Add() {
		System.out.println("ADD: "+(a+b));
		
	}
	public void Sub() {
		System.out.println("SUB: "+(a-b));
		
		
	}
	public Sum(String a) {
		System.out.println(a);
	}
	
}
