package JavaCollections;

public class WrapperClassObject {

	public static void main(String[] args) {
		//wrapper class  =Integer,Double,Long,Character,Float
		   int a=100;
		   int b;
		   String price="250";
		   
	     Integer myInt = 6;
	    Double myDouble = 5.02d;
	    Long myLong=8798876876L;
	    String myStr="Nivedita";
	    Character myChar = 'B';
	    System.out.println("myInt: "+myInt);
	    System.out.println("myDouble: "+myDouble);
	    System.out.println("myChar: "+myChar);
        System.out.println("myLong: "+myLong);
        System.out.println("myStr: "+myStr);
        System.out.println("store the integer value as a String: ");
        String myStr1 = myInt.toString();
	    System.out.println(myStr1.length());
	   
	    Long objlong=myLong.longValue();
	    System.out.println("objlong: "+objlong);
	    System.out.println("equalTo:");
	    System.out.println(objlong.equals(objlong));
	    
	    
	    //convert Integer value to string value
	    a=Integer.parseInt(price);                 
	    b=a+100;
	    System.out.println("value is="+b);
	    
	    //convert string value to integer value
	    String c;
	    c=Integer.valueOf(b).toString();
	    System.out.println("Value is="+c);
	    
        
	}

}
