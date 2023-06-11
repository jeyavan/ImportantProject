package Threads;

public class yieldThread extends Thread {

	public void run() {
	    for(int i=1;i<=5;i++) {
	    	Thread.yield();                   
	    	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
				System.out.println("Child Thread "+i);
			}
		}
	public static void main(String[] args) {
		

	}

}

//yield();
//currently executing thread giving its chances to other threads. 
//other threads which have same priority as of yielding thread
