package Threads;

public class JoinCaller {

	public static void main(String[] args) throws InterruptedException {
		JoinThreading jt=new JoinThreading ();
		//System.out.println(ct.getState());               //start the new thread here
		jt.start();
		jt.join();                                         //main thread is waiting until child thread finish the execution  
		//System.out.println(ct.getState());               //Runnable state
		for(int i=0;i<5;i++) {
			
			System.out.println("Main Thread "+i);
		}

	}

}
