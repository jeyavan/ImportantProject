package CommonProgram;

public class StringDT {

 public static void main(String[] args) {
	String str="My \'name\' is \\Nivedita"; // name is in 4th place(0,1,2,3,4)
    String name="Vani";                
    String lastname="Saratha";
    String collegename="shanmuganathan";
    System.out.println("Enter the str: "+str);
    System.out.println(name.concat(" "+lastname));
    System.out.println(name.concat(lastname));
    System.out.println(collegename.toUpperCase());
    System.out.println(name.length()+" "+name.toLowerCase());
    System.out.println(lastname.length()+" "+lastname.toString());
	System.out.println(str.indexOf("name"));
	System.out.println(str.indexOf("is"));
	
	}

}
