package basicprograms;

public class ControlStatEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=39,c=49,d=0;
		
		if(a>b && a>c) {
			System.out.println("A is greater");
		}
		else if(b>a && b>c) {
			System.out.println("B is greater");
		}
		else
			System.out.println("C is greater");
		
		if(d==0) {
			System.out.println("Zero");
		}
		else if(d>0) {
			System.out.println("Positive");
		}
		else if(d<0) {
			System.out.println("Negative");
		}
	}

	
}
