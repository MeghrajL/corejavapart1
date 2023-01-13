package basicprograms;

import java.util.Scanner;

public class CalcEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a , b,choice;
		char op;
		int exit=0;
		Scanner scanner = new Scanner(System.in);
		
		/*while (exit==0) {
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
		System.out.println("1 to exit, 0 to continue");
		exit = scanner.nextInt();
		}*/
		
		do {
			System.out.println("enter choice 1.Add 2.Sub 3.Mul 5.Div 5.Exit");	
			choice = scanner.nextInt();
						
			switch(choice) {
			case 1:
				System.out.println("Enter 2 no.s");
				a = scanner.nextInt();
				b = scanner.nextInt();
				System.out.println("Ans");
				System.out.println(a+b);
				break;
			case 2:
				System.out.println("Enter 2 no.s");
				a = scanner.nextInt();
				b = scanner.nextInt();
				System.out.println("Ans");
				System.out.println(a-b);
				break;
			case 3:
				System.out.println("Enter 2 no.s");
				a = scanner.nextInt();
				b = scanner.nextInt();
				System.out.println("Ans");
				System.out.println(a*b);
				break;
			case 4:
				System.out.println("Enter 2 no.s");
				a = scanner.nextInt();
				b = scanner.nextInt();
				System.out.println("Ans");
				System.out.println(a/b);
				break;
			default:
				System.exit(0);
				break;
			}
			
		}while(choice!=5);
	}

}
