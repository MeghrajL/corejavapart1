package oops;

public class ExceptionEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 10/0;
			System.out.println(a);	
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally");
		}
		
		try {
			int[] numbers= {1,2,3};
			System.out.println(numbers[50]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally");
		}
		
		try {
			int a = Integer.parseInt(null);
			System.out.println("a = "+a);
			
//			int b = Integer.parseInt("Hi");
//			System.out.println("b = "+b);
			
//			int c = Integer.parseInt("90");
//			System.out.println("c = "+c);
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally Code");
		}
		
		try {
			String s = null;
			System.out.println(s.length());
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
