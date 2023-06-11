package Arrays;

public class ArrayIF {

	public static void main(String[] args) {
		float[] anArrayOfFloats= {20.9f,23.2f,40.8f,50.2f,95.5f,100.6f};
		String[] anArrayOfStrings= {"cake","chocolate","ice crem","Ballon","food"};
		float Totalamount=20.9f+23.2f+40.8f+50.2f+95.5f;
		System.out.println("anArrayOfFloats Length: "+anArrayOfFloats.length);
		if(Totalamount==anArrayOfFloats.length) {
			System.out.println("you have spent money less than totalamount");
			}
		else if(Totalamount<anArrayOfFloats.length) {
			System.out.println("Condition false");
			
		}
		else {
			System.out.println("you have spent money more than totalamount");
		}
		
		System.out.println("Total cost: "+anArrayOfStrings[0]+" "+anArrayOfFloats[0]);
		System.out.println("Total cost: "+anArrayOfStrings[1]+" "+anArrayOfFloats[1]);
		System.out.println("Total cost: "+anArrayOfStrings[2]+" "+anArrayOfFloats[2]);
		System.out.println("Total cost: "+anArrayOfStrings[3]+" "+anArrayOfFloats[3]);
		System.out.println("Total cost: "+anArrayOfStrings[4]+" "+anArrayOfFloats[4]);
        System.out.println("Total amount: "+Totalamount);	
	
	}
	

}
