package Threads;


public class MultiThreading extends Thread {
 public void run() {   
		String b="It will call the run method when you call start method";
		//System.out.println(b);
		System.out.println("multiThread 1");
		
	}
 /*public class MultiThreading implements Runnable {
		//you must use run method when you use runnable class
		public void run() {
		    System.out.println("This code is running in a thread");
		  }*/
		
 
 
public static void main(String[] args) {
	 MultiThreading m=new  MultiThreading();
	  m.start();                         // when you call start method,It will call the run method
		/*Thread mo=new Thread(m);
		mo.start(); */ 
		
		
}


}