package Encapsulation;

public class ArrayEncapsulationDemo {
	   
  public int rollno;
	String a;
   public void setter(String lname,int num) {       
    	
    	this.a=lname+ num;
    	
    	}
    public String getter() {
    	return a;
    	
    }

	public static void main(String[] args) {
		ArrayEncapsulation myArray=new ArrayEncapsulation();
		myArray.array="Ram Kumar";
		ArrayEncapsulation myArray1=new ArrayEncapsulation();
		myArray1.array="Banu";
		ArrayEncapsulation myArray2=new ArrayEncapsulation();
		myArray2.array="Sam";
		System.out.println(myArray.getArray()+" "+myArray.getArray().length());
		System.out.println(myArray1.getArray()+" "+myArray1.getArray().length());
		System.out.println(myArray2.getArray()+" "+myArray2.getArray().length());
		 
		 
		ArrayEncapsulationDemo myDemo=new ArrayEncapsulationDemo(); 
		//myDemo.setter("phranav", 345);
		//we are giving getter value here 
		  myDemo.a="phranav "+345;     
		 System.out.println("getter: "+myDemo.getter());
		 

	}

}
