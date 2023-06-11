package Encapsulation; 

class Test{
	 // int a;                            //1)here using without private keyword in "int a" variable in default class "Test" 
	 private int a;                        //2)you can access the "a" variable  any where in the code
	                                      //*************************************************************
	                                        //1)here using with private keyword in "a" variable in default class "Test"
                                           //if you use "private keyword" in variable "a", you can access only default class"Test"&"with in a Package".
	 
	 
//when we use the private keyword which I get the error. so you can use getter and setter instead of display method.	 
 public void display() {               
	
	System.out.println(a);
}
	


public void setter(int x) {
	a=x;
}
public int getter() {
	return a;
}
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		Test obj=new Test();
		//we get error here.
		//obj.a=10;                    //it is not taking value because "a" variable only access in default class(Test) and package 
                                      //we can't access another class(EncapsulationDemo)
                                     //if you want to access the "a" variable, you can get the "a" value by getter and setter method
		//obj.display(); 
		obj.setter(10);
		System.out.println(obj.getter());
		
	}

}
