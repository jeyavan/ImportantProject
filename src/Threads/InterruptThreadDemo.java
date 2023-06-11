package Threads;

public class InterruptThreadDemo {

	public static void main(String[] args)throws InterruptedException {
		InterruptThread it=new InterruptThread();
		it.start();
		it.interrupt();
		for(int i=1;i<=5;i++) {
			System.out.println("Main Thread "+i);
		}
		
		
	}

}
