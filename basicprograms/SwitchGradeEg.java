package basicprograms;

import java.util.Scanner;

public class SwitchGradeEg {
	public static void main(String[] args) {
		int grade;
		
		Scanner scanner = new Scanner(System.in);
		grade = scanner.nextInt();
		grade /= 10;
		
		switch(grade) {
		case 10:
			System.out.println("A+");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		case 5:
			System.out.println("E");
			break;
		default:
			System.out.println("F");
			break;
		}
	}
}
