package inheritance;
 class Inheritances{
	protected String details="Employee Details"; 
	protected String name="Malika";
	public long contactNo=4567891245l;
	protected double salary =450000.25d;
	public void coustomerDetail() {
	System.out.println("employee address: 786,potter pl,MD");
		
	}
}
class Techonology extends Inheritances{
	 public String job="Java Developer";
	 public int experience=5;
	 
	 public void companyName() {
	System.out.println("CompanyName: ABC");
	 }		
	 
	}
class Hours extends Inheritances{
public int hours = 8;
}
public class Inheritance {
public static void main(String[] args) {
	
		Hours obj=new Hours();
		System.out.println("             "+obj.details.toUpperCase());
		System.out.println("Name: "+obj.name+" ContactNo: "+obj.contactNo+" Salary: "+obj.salary+" working hours: "+obj.hours);
		obj.coustomerDetail();
		
		Techonology tec=new Techonology();
		System.out.println("Technology: "+tec.job+" Experience: "+tec.experience);
		tec.companyName();
		
         
	}
}
		