package MethodCalling;

public class ifStaticMethod {

	static void whatsApp() {
		int ForwardMsg=7;
		if(ForwardMsg>9) {
			System.out.println("your message has been sucessfully sent");
		}
		else if(ForwardMsg>8) {
			System.out.println("your message has been sucessfully sent");
			
		}
		else {
			System.out.println("you can only share with up to 7 chats");
		
		}
	}
	static void NetBanking() {
		int Amount=5000;
		String CustomerName ="Kumar";
		String Name ="Bankofamerica";
		long AccNO= 456921687L;
		long ContactNum=2405810485L;
		if(Amount>=7000) {
			
		System.out.println("Bank name: "+Name.toUpperCase());
		System.out.println("customer name: "+CustomerName);
		System.out.println("contact number: "+ContactNum);
		System.out.println("Acount number: "+AccNO);
		System.out.println("Your fund is Succesfully transfered");
		System.out.println("Thank you");
		
		}
		else if(Amount!=5000 && Amount>7000) {
			  System.out.println("Your fund is not Succesfully transfered"); 
			  
				
			}
		
		else {
			System.out.println("your transfer amout limit is higher than usual limit");  
			System.out.println("Please try again");
			
		}
	}
static void WhileMethod() {
	int i=0;
	while(i<=5) {
		System.out.println(i);
	i++;
	continue;
	}
}
static void arryMethod() {
	int[][] arr = { { 1, 2 }, { 3, 4 } };
	 for (int i = 0; i < 2; i++)
     for (int j = 0; j < 2; j++)
  System.out.println("arr[" + i + "][" + j + "] = "+ arr[i][j]);
}
public static void main(String[] args){
		whatsApp();
		NetBanking();
		WhileMethod();
		arryMethod();
	}
		
	}
