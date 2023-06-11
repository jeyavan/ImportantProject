package Constructor;

public class Constructor {
	int a;
	int b=20;
	String x;
	
	
public void add( ){
		//a=20;          //change the attribute value here
		System.out.println("Addition: "+(a+b));
		
		}

static void sub(int c,int d) {
	
	System.out.println("Subtraction: "+ (c-d));
	
	
}
public Constructor(){
	x="Ram"; 
	a=50;
	
	
}

  public void divi(double c, double d) {
	System.out.println("Division : "+c/d);
   }
  

	public static void main(String[] args) {
		System.out.println("I use static method here: ");
		sub(20,15);
		Constructor ad=new Constructor();
		 System.out.println("I use public method here:");
		 ad.add();
		Constructor ad1=new Constructor();
		ad1.divi(80d,15d);
		Constructor con=new Constructor();
		System.out.println("I call constructor here:");
		//con.x="seetha";              //we can change the value here if you want
		System.out.println(con.x);
		 
		ConstructorValue test=new ConstructorValue(); 
		System.out.println("Create an object of ConstructorValue class here");
		System.out.println("Multiplication: "+ test.c);
		   
		}

}
