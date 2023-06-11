package DateTime;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.*;
public class DatetimeCustomize {

	public static void main(String[] args) {
		//Customize date and time
	Date date=new Date();
	System.out.println(date);
	//it shows milli seconds
	System.out.println(date.getTime());
	//it shows hours
System.out.println(date.getHours());//
SimpleDateFormat sdf=new SimpleDateFormat("M /dd/yyy/hh-mm-ss");
System.out.println(sdf.format(date));

	}

}
