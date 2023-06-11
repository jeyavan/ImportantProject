package JavaCollections;
import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// Create a HashMap object called myobj
		
		HashMap<String,Integer> myobj=new HashMap<String,Integer>(); 
				
		// Add keys and values (City, code)
				
				myobj.put("Madurai",21075);
				myobj.put("Chennai", 30987);
				myobj.put("Karaikudi", 45677);
				myobj.put("Tiruchi ",56788);
				
				//myobj.put("Tiruchi ",56788);
				System.out.println(myobj);
				System.out.println("\nGet the key value:");
				System.out.println(myobj.get("Madurai"));
				
				myobj.remove("Karaikudi");
				System.out.println("\nRemove the key : ");
				System.out.println(myobj);
				System.out.println("\nClear the all iteams: ");
				myobj.clear();
		System.out.println(myobj);

	}

}
