package ClassObjectPublicStaticMethod;

public class libraryDemo{
	
	String LibraryName="Howard county library";
	String address;
	long contact=248972345l;
	final String[] time= {"9 AM to"," 10 PM"};
	String remainder;
	public void helloDemo(){
		
	System.out.println("Thank you");
	
	}
	public void remainder() {
		
	 System.out.println("If you return the book after due date you need to pay $1 per day untill you return the book");
		
	}
	static void totalBooks() {          
		int books= 50000;
		System.out.println("Total books of library: "+books);
		
	}
	public static void main(String[] args) {
		
		libraryDemo object=new libraryDemo();
		//System.out.println("Library Location");
	    System.out.println("\n             "+object.LibraryName.toUpperCase()+"\n");
		object.address="10375 Little Patuxent Pkwy, Columbia, MD 21044";
		System.out.println("Library adress: "+object.address);
		System.out.println("Contact Number: "+object.contact);
		String[] hours= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		for(int i=0;i<6;i++) {
			System.out.println("Hours: "+hours[i]);
			
		}
		//System.out.println("Hours: "+ object.hours[0]+","+object.hours[1]+","+object.hours[2]+","+object.hours[3]+","+object.hours[4]+","+object.hours[5]);
		System.out.println("Library time: "+object.time[0]+""+object.time[1]);
		
		libraryBookDetails bookdetails=new libraryBookDetails();
		//bookdetails.book();
		      
		     for (int i = 0; i <4; i++) {
			System.out.println("Books: "+bookdetails.books[i]);
			}
		System.out.println("Books Details: "+bookdetails.books[0]+","+bookdetails.books[1]+","+bookdetails.books[2]);
		//System.out.println("Total library books: "+bookdetails.totalBook);
	   //this is static method so we don't create new object.
		totalBooks();
		libraryCustomerDetails customer=new libraryCustomerDetails();
		
		System.out.println("\n              "+customer.details.toUpperCase()+"\t");
		System.out.println("\nCustomer Name: "+customer.name+"\t");
		System.out.println("Address: "+customer.adress);
		System.out.println("contactNumber: "+customer.contactNumber);
		System.out.println("Library card number: "+customer.cardDetails);
		System.out.println("Book Author: "+customer.bookAuthor[0]+","+customer.bookAuthor[1]);
		System.out.println("Total books: "+customer.book );
		customer.date="3/5/2023";                       //change the date value here    
		System.out.println("Book Checked out date:"+customer.date);
		
		libraryCustomerDetails customers=new libraryCustomerDetails();
		       
		System.out.println("Due Date: "+customers.endDate);
		//System.out.println("If you return the book after due date you need to pay $1 per day until you return the book");
		
		
		object.remainder();  //public method so you have to create new object first which is working her.(line no 22) we created you can see 
		object.helloDemo();  //public method
		
	}
	

}
