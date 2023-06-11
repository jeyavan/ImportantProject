package inheritance;

public class carinheritanceDemo {

	public static void main(String[] args) {
	
		carInheritance vehicle1=new carInheritance();
		vehicle1.cars();
		System.out.println("***************************");
		Motercycle vehicle2=new Motercycle("Motercycle Information: ");
		vehicle2.motercycles();
		System.out.println("*********************************************");
		
		Cycle vehicle3=new Cycle("Cycle Information: ");
		System.out.println("c)Cyclebrand: "+vehicle3.carbrand+" cyclecolor: "+vehicle3.cyclecolor+" cyclewheel: "+vehicle3.cyclewheel);
	    Inheritances i=new Inheritances();
	    System.out.println(i.details);
		
	}

}
