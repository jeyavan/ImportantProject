package Threads;

public class MultipleThread extends Thread {
	public void run() {
		for(int i=0;i<5;i++) {
			
			System.out.println("Child thread: "+i);
		}
		
	}

	public static void main(String[] args) {
		
		
		
	}

}
