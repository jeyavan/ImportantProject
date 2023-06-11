package MethodCalling;

public class PrivatePracticeDemo1 {

	public static void main(String[] args) {
		
		PrivatePracticeDemo p=new PrivatePracticeDemo();
		//you can asses anywhere if it is public keyword
		System.out.println(p.a);
	     p.sub();
	     PrivatePracticeDemo.mul();  //When you call the static method from another class,you can call like that  
	                                 //(classname.method name)
	                                 //  PrivatePracticeDemo.mul() 
	}

}
