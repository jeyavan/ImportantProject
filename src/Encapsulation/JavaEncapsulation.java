package Encapsulation;

public class JavaEncapsulation {
 
String addres="234,delfield Rd,MD";
final long Salary=450000l;
public int x;
public int area;
public String name;
private String remainder;

     // Getter
   public int getInt() {
		    return x;
		  }
		  // Setter
		  public void setInt(int a ,int b) {
		    
			this.x =a+b;
			this.x=a-b;
			this.x=a*b;
			this.x=a/b;
		  }
		  public int getArea() {
			  return area;
			  
		  }
		  public void setArea(int l,int w) {
			  this.area=l*w;
			  
		  }
		  public String getName() {
			  
			  return name;
		  }
		  public void setName(String firstName, String lastName) {
			  this.name=firstName+lastName;
		  }
		  public String method(int b,int c) {
			  System.out.println(b+c);
			  return remainder;
		  }
         
		
		}
		 



