package basicprograms;

import java.util.Scanner; 

public class ArithmaticOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); 
		System.out.println("Enter 2 integers ");
		int a = s.nextInt(); 
		int b = s.nextInt();
		System.out.println("Enter your percentage ");
		float perc = s.nextFloat();
		System.out.println("Enter your name");
		String name = s.next();
		//String name = s.nextLine();
		char ch = name.charAt(0);
		System.out.println("Sum "+(a+b));
		System.out.println("percentage "+perc);
		System.out.println("name "+name);
		System.out.println(ch);
	}

}
