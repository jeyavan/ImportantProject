package Enums;

public class EnumIfElse {
	
	enum Day{
	    SUNDAY,
	    MONDAY,
	    TUESDAY,
	    WEDNESDAY,
	    THURSDAY,
	    FRIDAY,
	    SATURDAY
	  }

	  public static void main(String[] args) {
	    Day d = Day.WEDNESDAY; 
	    System.out.println(d);
	    
	   if(d==Day.FRIDAY) {
		   System.out.println("Working day");
		   
	   }
	   else if(d==Day.MONDAY) {
		   System.out.println("Working day");
	   }
	   else if(d==Day.TUESDAY) {
		   System.out.println(" Working day");
	   }
	   else if(d==Day.WEDNESDAY) {
		   System.out.println(" working day");
		   
	   }
	   else if(d==Day.THURSDAY) {
		   System.out.println("working day");
	   }
	   else if(d==Day.SUNDAY) {
		   System.out.println("it's Holiday");
	   }
	   else if(d==Day.SATURDAY) {
		   System.out.println("it's Halfday");
	   }
	   
	  
	}
}

		