package Threads;

public class JoinThreading extends Thread {
	public void run(){
	for(int i=0;i<5;i++) {
		
		                                  
		try {
			Thread.sleep(1000);                              //running- sleep- runnable
		} catch (InterruptedException e) {
			
			//e.printStackTrace();
		}
		System.out.println("chaild Thread "+i);
	}
	}
     
	public static void main(String[] args) {
		

	}

}
//join():
//if a thread wants to wait until any other thread's execution.