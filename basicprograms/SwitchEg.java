package basicprograms;

import java.util.Scanner;

public class SwitchEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a , b;
		char op;
		
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		op = scanner.next().charAt(0);
		switch(op) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		case '%':
			System.out.println(a%b);
			break;
		default:
			System.out.println("Invalid");	
		}
		
	}

}
