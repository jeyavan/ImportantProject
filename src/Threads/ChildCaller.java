package Threads;

public class ChildCaller {

	public static void main(String[] args) {
		
	ChildThread ct=new ChildThread ();
	//Thread life cycle
	System.out.println(ct.getState()); 
	ct.setPriority(1);                                        //Thread schedule(1 to 10) default priority 5
	System.out.println("Get Priority: "+ct.getPriority());        //getId for thread 
	ct.start();                                                 //start the thread here.
	System.out.println(ct.getState()); 
		
	ct.setName("Customer"); 
	System.out.println("Name: "+ct.getName());                     //set the name here
	                   
	
	
	
	MultiThreading m=new  MultiThreading();
	m.start();
	System.out.println("Default priority: "+m.getPriority());
	System.out.println("ID: "+m.getId());
	
	for(int i=1;i<=5;i++) {
	    System.out.println("Main Thread "+i);
		}
		System.out.println(ct.getState()); 
	}
        
	}


