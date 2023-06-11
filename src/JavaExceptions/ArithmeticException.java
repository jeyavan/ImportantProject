package JavaExceptions;
import java.util.Scanner;
public class ArithmeticException {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);	
		int d=6+7;
		int f=7-14;
		System.out.println("d value:"+d);
		System.out.println("f value:"+f);
		System.out.println("Enter the a value");
		int a=scn.nextInt();
		System.out.println("Enter the b value");
		try {
		int b=scn.nextInt();
		
		long c=(a/b);
		System.out.println("c value: "+c);
		
				
		}catch(Exception e) {
			System.out.println("you can't divide whole number by zero");
			
		}finally {
			
			System.out.println("Thak you for using calculator");
		}
			
		}
}


