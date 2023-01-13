package oops;

final class FinalClass{
	public void display() {
	    System.out.println("final class");
	  }
}

class FinalMethod extends FinalClass{//final class cannot be extended
	public final void display() {
	      System.out.println("final method");
	}
}

public class FinalEg extends FinalMethod{
	public final void display() { //final method display declared previously cannot be overriden
	    System.out.println("The final method is overridden.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalEg f = new FinalEg();
		
		final int AGE = 20;
		AGE = 25;//cannot change 
	    System.out.println("Age " + AGE);
	}

}
