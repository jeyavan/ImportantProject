package Enums;

public class EnumSwitch {
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
	
	Day myday=Day.MONDAY;
	
	Day myday1=Day.SUNDAY;

	
	switch(myday) {
	case SUNDAY:
		System.out.println("its a holiday");
	break;
	case MONDAY:
		System.out.println(myday);
		System.out.println("its working day");
	break;
	default:
		break;
	}
	switch(myday1) {
	
	case SUNDAY: 
		System.out.println(myday1);
		System.out.println("its a holiday");
		break;
	default:
		break;
	}
}

}
