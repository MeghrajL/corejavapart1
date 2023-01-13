package oops;

public class ThrowsEg {

	static void Age(int age) {
		if(age <18) {
			throw new ArithmeticException("must be 18+");
		}
		else {
			System.out.println("Access granted");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Age(17);
	}

}
