package Threads;

public class SingleThread {

	public static void main(String[] args) {
		MultipleThread mt=new MultipleThread();
		//mt.run();                             //single thread(sequence execution)
		 mt.start();                            //multiple thread(Parallel execution)->It is called concurrent Programming 
		
           for(int i=0;i<5;i++) {
			
			System.out.println("Main thread: "+i);
		}
		

	}

}
