package ClassObjectPublicStaticMethod;



public class libraryBookDetails {
	 
     String[] books={"story","Fiction","Non-Fiction","Scientific"};
     
     static void books() {
    	 //static method we can use only same class and main method. we can't call this method from other class

         for (int i = 0; i <3; i++) {
        	 System.out.println(i);
		
		}
    	 
     }
     
     public void book() {
    	 for (int i = 0; i <4; i++) {
 			System.out.println("Books: "+i);
 			}
    	 
    	 
     }
	public static void main(String[] args) {
		
		books();

	}

}
