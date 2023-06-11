package ScannerClass;
import java.util.Scanner;
public class Userinput {
public static void main(String[] args) {
String Name="Ramya", Name1="Uma";
Scanner scn=new Scanner(System.in);	
System.out.println("Name");
System.out.println(Name);
System.out.println("Enter the English mark");
int English =scn.nextInt();
System.out.println("Enter the Science mark");
int Science =scn.nextInt();
System.out.println("Enter the Math mark");
int Math=scn.nextInt();
int Total= English+Science+Math;
System.out.println("Enter the total: " + Total);
System.out.println(".............................");
System.out.println("Name1");
System.out.println(Name1);
System.out.println("Enter the English mark");
int English1 =scn.nextInt();
System.out.println("Enter the Science mark");
int Science1 =scn.nextInt();
System.out.println("Enter the Math mark");
int Math1=scn.nextInt();
int Total1= English1+Science1+Math1;
System.out.println("Enter the total: " + Total1);
System.out.println(".............................");
}
}
