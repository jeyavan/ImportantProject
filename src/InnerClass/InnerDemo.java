package InnerClass;
class OuterClass {
	  int a = 10;
      int b=20;
      
	  class InnerClass {
	    int c=2;
	    int d=a+b;
	  }
	}

public class InnerDemo { 
	  public static void main(String[] args) {
		  
	    OuterClass myOuter = new OuterClass();
	    OuterClass.InnerClass myInner = myOuter.new InnerClass();
	    System.out.println("Value: "+myInner.c *(myOuter.b+myOuter.a));
	    System.out.println("d value: "+myInner.d);
	  }
	}




