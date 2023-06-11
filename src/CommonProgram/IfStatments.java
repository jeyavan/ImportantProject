package CommonProgram;

import java.time.LocalDate;
import java.util.Scanner;

public class IfStatments {

	
public static void main(String[] args) {

	String customername="Nivedita";
	String bankname="Bank Of America";
	String bankaddress="1073,ABC,MD-21075";
	 long Totalamount=45000;
	//int value=2000;
	
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the card number: ");
    long cardnumber =scn.nextLong();
	System.out.println("CardNumber: "+cardnumber);
	System.out.println("Customer Name: "+customername);
	System.out.println("Bank Name: "+bankname.toUpperCase());
	System.out.println("Bank Address: "+bankaddress);
	System.out.println("Amount Debit: ");
	long amountdebit =scn.nextLong();
	System.out.println("your amount: "+amountdebit);
	
if (Totalamount>=5000) {
	System.out.println("your money is processing");
	System.out.println("Don't remove your card");
	System.out.println("Totalamount: "+Totalamount);
		
	
	
	}
else if(Totalamount<=46000) {
	
	System.out.println("your amount is more then Totalamount ");
	System.out.println("Please try again");
	
		
	}
else {
	System.out.println("Please try again");
}
	

	LocalDate myObj = LocalDate.now();                          // Create a date object
    System.out.println("Transaction Date: "+myObj);              // Display the current date

	System.out.println("Thank You");
	}
}