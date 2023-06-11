package Enums;

public class EnumsForLoop {
	
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
		    for (Day d : Day.values()) {
			  System.out.println(d);
			}

		
	}

}
