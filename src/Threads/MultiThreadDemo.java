package Threads;

public class MultiThreadDemo implements Runnable {
	//you must use run method when you use runnable class
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		for(int i=0;i<5;i++) {
	   		System.out.println("Child Thread "+i);
		
	  }
	
	}
public static void main(String[] args) {
	 
	MultiThreadDemo m=new MultiThreadDemo();
	Thread mo=new  Thread(m);
	//m.run();
	 mo.start();
	 
	
	for(int i=0;i<5;i++) {
		System.out.println("Main Thread "+i);
		
	}
	
		
	}

}
