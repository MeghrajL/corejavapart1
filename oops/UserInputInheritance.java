package oops;

import java.util.Scanner;

class Addition {
	int a;
	int b;
	Scanner s = new Scanner(System.in);
	void add() {
		System.out.println("enter values for a & b");
		a=s.nextInt();
		b=s.nextInt();
		
		System.out.println(a+b);
	}
}

class Subtraction extends Addition{
	int a;
	int b;
	Scanner s = new Scanner(System.in);
	void sub() {
		System.out.println("enter values for a & b");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println(a-b);
	}
}

public class UserInputInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subtraction s = new Subtraction();
		s.add();
		s.sub();
	}

}
