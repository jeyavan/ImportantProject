package JavaCollections;
import java.util.LinkedList;
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> vehicle = new LinkedList<String>();
		vehicle.add("Bus");
		vehicle.add("Truck");
		vehicle.add("Bike");
		vehicle.add("Bycycle");
		System.out.println(vehicle);
		
		System.out.println(vehicle.add("Van"));
		System.out.println(vehicle);
		
        System.out.println("\nAdd the first value(Truck):");
        vehicle.addFirst("Truck");
        
        System.out.println(vehicle);
        System.out.println("\nAdd the last value(Bus):");
        vehicle.addLast("Bus");
        System.out.println(vehicle);
        System.out.println("\nRemove the value (Bike)");
        vehicle.remove("Bike");
        System.out.println(vehicle);
        System.out.println("\nRemove the first value:");
        vehicle.removeFirst();
        System.out.println(vehicle);
        vehicle.removeLast();
        System.out.println("\nRemove the last value(Bus):");
        System.out.println(vehicle);
        System.out.println("\nGet first value: ");
        System.out.println(vehicle.getFirst());
        System.out.println("\nGet Last value: ");
        System.out.println(vehicle.getLast());

	}

}
