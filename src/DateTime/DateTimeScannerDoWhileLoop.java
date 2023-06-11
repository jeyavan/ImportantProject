package DateTime;

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
		
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the card number: ");
	    long creditcardnumber =scn.nextLong();
		System.out.println("Credit card Number: "+creditcardnumber);
		System.out.println("Customer Name: "+customername);
		System.out.println("Bank Name: "+bankname.toUpperCase());
		System.out.println("Bank Address: "+bankaddress);
		System.out.println("Savings Account: ");
		long amountdebit =scn.nextLong();
		
		/*do {
			System.out.println("your amount hasn't been debited");
			System.out.println("try again");
			break;
		}
		while(amountdebit<=44000);*/
		
		while(amountdebit>=44000) {
			
			System.out.println("your amount hasn't been debited");
			System.out.println("your Debit amount is more than total amount");
			System.out.println("Please try again");
			break;
			
		}
			
	
		
		    while(amountdebit<=44000) {
			if(amountdebit>=5000) {
			    System.out.println("Totalamount: "+Totalamount);
				System.out.println("Amount has been Debited: "+amountdebit);
				System.out.println("Remaining amount is: "+(Totalamount-amountdebit));
				amountdebit++;  
				break;
				}else {
					System.out.println("you can get money above 5000 from your account");
				}
			break;
		}
				 
		
		LocalDateTime myDateObj = LocalDateTime.now();
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM-dd-yyyy hh:mm:ss");
	    String dateformated=  myDateObj.format(myFormatObj);
	    System.out.println("Transaction time and date: " + dateformated);
        System.out.println("Thank You");
		
		
		
	}

}
