package MethodCalling;

public class MathFormulaStaticMethod {
	static void squareMethod() {
	double side=25.7D;
    double AreaOfaSquare=side*side;
	System.out.println("Area of a square value is: "+ AreaOfaSquare);

	}
	static void perimeterSquare(long side) {
	long perimeterOfaSquare=4*side;
	System.out.println("Perimeter of a Square value is: "+perimeterOfaSquare);
		
	}
	static double percentageMethod(float x){
		double percentage=(x/100d);
		System.out.println("percentage: "+percentage);
		return percentage;
	
	}
	static int boxVolume(int length,int breadth,int height) {
		int volume=length*breadth*height;
		return volume;
		
	}
	
 public static void main(String[] args) {
		squareMethod();
		perimeterSquare(2);
		percentageMethod(47f);
		int vol=boxVolume(10,15,10);   //store the volume here
		System.out.println("Boxvolume is: "+vol);

	}

}
