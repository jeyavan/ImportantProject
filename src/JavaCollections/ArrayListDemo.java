package JavaCollections;

import java.util.ArrayList;

public class ArrayListDemo {
public static void main(String[] args) {
	
	ArrayList<Integer> array=new ArrayList<Integer>(); 
	array.add(12);
	array.add(3);
	array.add(10);
	array.add(5); 

	System.out.println(array.add(6));
	System.out.println(array);
	System.out.println("set the value 20 instead of 10 value: ");
	array.set(2, 20); 
	System.out.println(array);
	System.out.println("remove the value 6: ");
	array.remove(4); 
	System.out.println(array);
	System.out.println("Get the value: "+array.get(1));                  
	System.out.println("********************************");
	for(int i: array) {
	System.out.println(i);
		
	}

}


}
