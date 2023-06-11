package MethodCalling;

public class JavaPractice {
	final int add(int a,int b) {     //this is public method using with final keyword and return type
	int add=a+b;
	System.out.println("add value: "+add);
	return add;	
	}
	static int sub(int a,int b) {    //this is static method which I use with return types.
	int sub=a-b;
	System.out.println("Sub value: "+sub);
	return sub;
	}
	public void mul() {            //this is public method             
	int a=20;
	int b=10;
	int c=a/b;
	System.out.println("Mul: "+c);
		
	}
	private JavaPractice(String a) {     //this is constructor method which i use with private
		System.out.println(a);
		
	}
	
    
	public static void main(String[] args) {
		JavaPractice j=new JavaPractice("Welcome");
		j.add(10,20);
		j.mul();
		sub(20,30);
		
		

	}

}
