package CommonProgram;

public class Ageif {

	public static void main(String[] args) {
		int user=67;
		if(user <19) {
			System.out.println("18 or younger");
		}
		else if(user>16 && user <19) {
			System.out.println("user is between 17 and 20");
			
		}
		else if(user==45 || user==50) {
			System.out.println("user is either 45 or 50");
			}
		else if(user>60) {
		System.out.println("user is above 60 ");
				}
		
		else {
			System.out.println("user is older than 60");
		}

}
}
