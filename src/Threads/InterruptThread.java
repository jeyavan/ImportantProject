package Threads;

public class InterruptThread extends Thread {
	public void run() {
	    for(int i=1;i<=5;i++) {
	    	try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("My sleep got interrupter");
				//e.printStackTrace();
			}
				System.out.println("Child Thread "+i);
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//Interrupt();
//we can use both sleeping state or waiting state in Interrupt().