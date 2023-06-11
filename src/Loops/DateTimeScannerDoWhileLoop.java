package Loops;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeScannerDoWhileLoop {
	public static void main(String[] args) {
		
		String customername="Nivedita";
		String bankname="Bank Of America";
		String bankaddress="1073,ABC,MD-21075";
		long Totalamount=44000;
		//int value=5000;
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the card number: ");
	    long creditcardnumber =scn.nextLong();
		System.out.println("Credit card Number: "+creditcardnumber);
		System.out.println("Customer Name: "+customername);
		System.out.println("Bank Name: "+bankname.toUpperCase());
		System.out.println("Bank Address: "+bankaddress);
		System.out.println("Savings Account: ");
		System.out.println("Totalamount: "+Totalamount);
		long amountdebit =scn.nextLong();
		
		do {
			System.out.println("your amount hasn't been debited");
			System.out.println("try again");
			break;
		}
		while(amountdebit<=44000);
      
		
		
		while(amountdebit<=44000) {
		if(Totalamount>=5000) {
				System.out.println("Amount has been Debited: "+amountdebit);
				System.out.println("Remaining amount is: "+(Totalamount-amountdebit));
				amountdebit++;     
				    
			}
			break; 
			
	}
		
		
	
			
		
		
		
		
		
		
		
		
		
		/*if(Totalamount>=value) {
			System.out.println("Amount has been Debited: "+amountdebit);
		System.out.println("Totalamount: "+Totalamount);
	    System.out.println("Remaining amount is: "+(Totalamount-amountdebit));
		
		
	 }        
	else if(Totalamount<=value) {
		System.out.println("Amount hasn't been Debited: ");
	   System.out.println("Please try again");
		
		
		}*/
		
	
		//LocalDate myObj = LocalDate.now();                          // Create a date object
	    //System.out.println("Transaction Date: "+myObj);             // Display the current date

	    LocalDateTime myDateObj = LocalDateTime.now();
	    System.out.println("Before formatting: " + myDateObj);
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM--dd--yyyy hh:mm:ss");

	    String formattedDate = myDateObj.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);


	    System.out.println("Thank You");
		
		
		
	}

}
