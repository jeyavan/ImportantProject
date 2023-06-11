package Encapsulation;

public class JavaEncapsulationTest {
	final int a=20;
	final int b=10;
	 int c=20;
	private String name;
	int age;
	private String user;
	private int x;
	
	//constructor
	public JavaEncapsulationTest(String fullname,int agee) {
		System.out.println("I am using constructor here:");
		name=fullname;
		age=agee;
		
		}
	public String getName() {
		return user;
	}
	public void setName(String fullname,int age) {
		this.user="fullname"+" age";
		
	}
	//static method
	static void square(int b) {
		int a=b*b;
		System.out.println("square: "+a);
		
	}
	//public method
	public int addd() {
		System.out.println("Add the 3 values: "+(a+b+c));
		return x;
		
	}
	
	
		  public static void main(String[] args) {
			  square(20);                         // static method calling here
			  JavaEncapsulationTest con=new JavaEncapsulationTest("phranav",20); //using constructor and Encapsulation
	          //con.user="Phranav "+30;
			   //System.out.println("Name&age: "+con.getName());
			   System.out.println(" Name: "+con.name+" age: "+con.age);
			   con.addd();                        // calling public method here
			   
			  JavaEncapsulation myObj = new JavaEncapsulation();
			  JavaEncapsulation myObj2 = new JavaEncapsulation();
			  JavaEncapsulation myObj3 = new JavaEncapsulation();
			  JavaEncapsulation myObj4 = new JavaEncapsulation();
			  myObj.x = 9+9;  
			  myObj2.x= 4-2;
			  myObj3.x=8*2;
			  myObj4.x=4/2;
			//System.out.println(myObj.name); // error 
				System.out.println("Add value: "+myObj.getInt());
				System.out.println("Sub value: "+myObj2.getInt());
				System.out.println("Mul value: "+myObj3.getInt());
				System.out.println("Divi value: "+myObj4.getInt());
			 
			  JavaEncapsulation myArea = new JavaEncapsulation();
			  myArea.area=10*2;
			  System.out.println("Area value: "+myArea.getArea());
			  JavaEncapsulation myname = new JavaEncapsulation();
			  myname.name="Nivedita"+"Gunasekaran";
			  System.out.println("FirstName & LastName :"+myname.getName());
		       //System.out.println(myObj.name); // error 
			  JavaEncapsulation addr=new JavaEncapsulation();
			  System.out.println("Address: "+addr.addres);
		      System.out.println("salary: "+ addr.Salary);
		      JavaEncapsulation re=new JavaEncapsulation();
		      re.method(20,10);
		      
				  }
		}


