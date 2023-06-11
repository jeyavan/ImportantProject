package inheritance;

public class carInheritance {
	   
	    String carbrand="Ford";
		String carcolor="Red";
		int carseats=5;
		int carwheel=4;
		public void cars() {
		System.out.println("\n          VEHICLES\n");	
		System.out.println("A)car brand: "+carbrand);	
		System.out.println("carcolor: "+carcolor);
		System.out.println("carseats: "+carseats);
		System.out.println("carwheel: "+carwheel);
			}
		}
	class Motercycle extends carInheritance {
		String motercyclebrand="Yamaha";
		String motercyclecolor="yellow";
		int motercyclewheel=2;
		
	public void motercycles() {        //public method
			System.out.println("B)motercyclebrand: "+motercyclebrand);	
			System.out.println("motercyclecolor: "+motercyclecolor);
			System.out.println("motercyclewheel: "+motercyclewheel);
			}
	public Motercycle(String a) {      //constructor
		
		System.out.println(a);
	}
	}
	class Cycle extends carInheritance {
		String cyclebrand="GiantBicycle";
		String cyclecolor="Blue";
		int cyclewheel=2;
		public Cycle(String a) {        //constructor
			
			System.out.println(a);
			
		}
		
	}



