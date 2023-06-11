package Threads;

public class YieldThreadDemo {

	public static void main(String[] args) {
		yieldThread  yt=new yieldThread ();
		yt.start();
		
		 for(int i=1;i<=5;i++) {
		    	Thread.yield();
					System.out.println("Main Thread "+i);       
				}
	}

}
