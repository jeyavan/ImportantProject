package MethodCalling;

public class PrivatePracticeDemo {
	int a=10;          //you can access anywhere in this code even another class too
	private int b=20;  //you can access anywhere in this code but you can't access another class
	
	private int add() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		return c;
		
	}
	public int sub() {
		int a=30;
		int b=40;
		int c=a-b;
		System.out.println(c);
		return c;
	}
	static void mul() {
		int a=30;
		int b=20;
		int c=30*20;
		System.out.println(c);
		
	}
	
	
	public static void main(String[] args) {
		PrivatePracticeDemo p=new PrivatePracticeDemo();
		//System.out.println(p.a);   // you can see PrivatePracticeDemo1 class
		System.out.println(p.b); 
        p.add();  //you can access only same main class and same main method but you can't access another class
	    mul(); //this is static method calling
              //if you access static method from another class,you can see PrivatePracticeDemo1 
	
	
	}

}
