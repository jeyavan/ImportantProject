package Springframework;
//loose coupling 1
public class Vechicle {
	private VechicleConsole carobj;
	public Vechicle(VechicleConsole carobj) {
		this.carobj=carobj;
		
		}
	
	public void Demo() {
	carobj.carDetails();	
	carobj.busDetails();
	
		
	}

	public static void main(String[] args) {
		Car carobj=new Car();
		Vechicle  vechicleobj=new Vechicle( carobj);
		vechicleobj.Demo();
		

	}

}
