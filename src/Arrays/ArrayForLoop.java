package Arrays;

public class ArrayForLoop {

	
	public static void main(String[] args) {
		
		int[][] anArrayOfInt={{10,30,41,52},{20,34,78,80}};
		String[][] anArrayOfStrings= {{"cake","chocolate","icecrem","coffee"},{"Ballon","food","juice","tea"}};
		String[][] names = {{"Mr. ", "Mrs. ", "Ms."},{"Phranav", "Jey"}};
		
		    System.out.println(names[0][0] + names[1][0]);
	        System.out.println(names[0][2] + names[1][1]);
	        
	       for(int coffee=1; coffee<=2;coffee++) {
	    	   System.out.print("coffee: ");
	    	   System.out.println(coffee);
	    	   
			}
	       System.out.println("anArrayOfStrings: "+anArrayOfStrings[0][3]);
			System.out.println(" anArrayOfFloats: "+ anArrayOfInt[1][2]);
	        System.out.println("total amount for two coffee: "+anArrayOfInt[1][2]*2);
	    }
	
	}
		
		
		
	
		



	  


