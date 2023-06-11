package JavaCollections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> vehicle=new HashSet<String>();
		
		vehicle.add("Cycle");
		vehicle.add("Tricycle");
		vehicle.add("Bike");
		vehicle.add("Car");
		
		//vehicle.add("Car");
		System.out.println("\nADD the valu: "+vehicle.add("Truck"));
		System.out.println(vehicle);
		System.out.println("\nRemove the value: "+vehicle.remove("Tricycle"));
		System.out.println(vehicle);
		System.out.println("\nGet the size: "+vehicle.size());
		System.out.println("\nitem exists : "+vehicle.contains("Car"));
		System.out.println("\n clear the all iteams: ");
		vehicle.clear();
		System.out.println(vehicle);
	}

}
